package rode.rbd.geradorScript;

import lombok.extern.java.Log;
import org.modcs.tools.parser.model.ExecutionRuntime;
import org.modcs.tools.parser.model.Script;
import rode.rbd.modelo.RBD;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import rode.spn.SPN;

@Log
public final class GeradorScript {

    public static String executaScript(SPN[] spns) throws Exception {
        var script_txt = criaScript(spns);
        System.out.println(script_txt);
        var runtime = new ExecutionRuntime();
        var script = new Script(script_txt);
        runtime.evaluateScript(script);
        var lista = new HashMap<String,List<String>>();
        for(var spn:spns)
            lista.put(spn.getNome(),new LinkedList<>(spn.getMetricas().entrySet().stream().map(Map.Entry::getKey).toList()));

        var metricas = extrairMetricas(runtime,
                lista
        );
        var sb = new StringBuilder();
        metricas.entrySet().forEach(e->{
            sb.append(e.getKey() + ":\n");
            e.getValue().entrySet().forEach(e2->{
                sb.append("\t" + e2.getKey() + " : ");
                sb.append(e2.getValue());
                sb.append('\n');
            });
        });
        return sb.toString();
    }
    private GeradorScript(){}
    private static final String METRICA = "\tmetric_%1$s_%2$s = solve(%1$s, %2$s);";
    private static final String METRICAS_RBD = """
            	metric_%1$s_av = solve(%1$s, av);
            	metric_%1$s_rel = solve(%1$s, rel);
            	metric_%1$s_mttf = solve(%1$s, mttf);
            	metric_%1$s_mttr = solve(%1$s, mttr);
            """;
    private static final String PRINT = "\tprintln(\"[%1$s] Availability: \" .. metric_%1$s_%2$s );";
    private static final String PRINTS_RBD = """
            	println("[%1$s] Availability: " .. metric_%1$s_av );
            	println("[%1$s] Reliability: " .. metric_%1$s_rel );
            	println("[%1$s] Mean time to failure: " .. metric_%1$s_mttf );
            	println("[%1$s] Mean time to repair: " .. metric_%1$s_mttr );
            """;
    private static final String CABECALHO = """
            t = %1$d;
                        
            %2$s
                        
            main{
                %3$s
                        
                %4$s
            }
            """;
    private static final String RETORNOS = """
            	[%1$s] Availability: %2$f
            	[%1$s] Reliability: %3$f
            	[%1$s] Mean time to failure : %4$f
            	[%1$s] Mean time to repair: %5$f
            """;






    public static String criaScript(SPN[] spns){
        //var spn = spns[0];
        var subModelos = new HashMap<String, LinkedList<String>>();
        for(var spn:spns) {
            var lista = new LinkedList<String>();
            if (spn.getMetricas() != null)
                spn.getMetricas().forEach((key, obj) -> {
                    lista.add(key);
                });
            subModelos.put(spn.getNome(),lista);
        }
        return criaScript(spns, subModelos);
    }

    public static String criaScript(SPN[] spns, HashMap<String, LinkedList<String>> subModelos){
        var mry = Arrays.stream(spns).map(SPN::getAsMry)
                .collect(Collectors.joining("\n\n"));
        var lista_metricas = new LinkedList<String>();
        subModelos.entrySet().stream()
                .map(e ->e.getValue().stream()
                        .map(e2->METRICA.formatted(e.getKey(), e2)
                        ))
                .forEach(e-> e.forEach(lista_metricas::add));
        var metricas = lista_metricas.stream()
                .distinct()
                .collect(Collectors.joining("\n"));
        var lista_prints = new LinkedList<String>();
         subModelos.entrySet().stream()
                .map(e ->e.getValue().stream().map(e2->
                        PRINT.formatted(e.getKey(), e2)))
                .forEach(e->e.forEach(lista_prints::add));
        var prints = lista_prints.stream()
                .distinct()
                .collect(Collectors.joining("\n"));
        return CABECALHO.formatted(100, mry ,metricas,prints);
    }
    
    public static String criaScript(RBD rbd, List<String> subModelos){
        var metricas = subModelos.stream()
                .map(METRICAS_RBD::formatted)
                .collect(Collectors.joining("\n"));
        var prints = subModelos.stream()
                .map(PRINTS_RBD::formatted)
                .collect(Collectors.joining("\n"));
        return String.format(CABECALHO,100,rbd.getAsMry(),metricas,prints);
    }

    public static String executar(RBD rbd) throws InterruptedException {
        rbd.varreComponentes();
        var subModelos = new LinkedList<String>();
        subModelos.add(rbd.getNome());
        rbd.getBlocos()
                .entrySet().stream()
                .map(Map.Entry::getKey)
                .forEach(subModelos::add);

        var script = criaScript(rbd,subModelos);
        System.out.println(script);
        return executaScript(script,subModelos);
    }

    public static HashMap<String,HashMap<String,Double>> executarScript(String script_txt, HashMap<String,List<String>> metricas) throws Exception{
        var runtime = new ExecutionRuntime();
        var script = new Script(script_txt);
        runtime.evaluateScript(script);
        var metricasCalculadas = extrairMetricas(runtime, metricas);

        return metricasCalculadas;
    }
    public static String executaScript(String script_txt,List<String> subModelos) throws InterruptedException {
        var runtime = new ExecutionRuntime();
        var script = new Script(script_txt);
        runtime.evaluateScript(script);
        var metricas = extrairMetricas(runtime,subModelos);
        return metricas.entrySet().stream()
                        .map(val -> {
                            var valor = val.getValue();
                            return RETORNOS.formatted(val.getKey(),valor.av,valor.rel,valor.mttf,valor.mttr);
                        })
                                .collect(Collectors.joining("\n"));
    }

    public static HashMap<String,ValoresMetricas> extrairMetricas(ExecutionRuntime runtime, List<String> subModelos) throws InterruptedException {
        var map =  new HashMap<String,ValoresMetricas>();
        var len = subModelos.size();
        var threads = new Thread[len];
        for(var i=0; i< len ; i++){
            final var ii = i;
            final var mapa = new HashMap<String, Double>();
            final var nomeModelo = subModelos.get(ii);
            final var modelo = runtime.getModel(nomeModelo);
            final var av = modelo.getMetric("av");
            final var rel = modelo.getMetric("rel");
            final var mttf = modelo.getMetric("mttf");
            final var mttr = modelo.getMetric("mttr");
            threads[i] = new Thread(()->{
                var av_result = av.solve();
                var rel_result = rel.solve();
                var mttf_result = mttf.solve();
                var mttr_result = mttr.solve();

                synchronized (map){
                    map.put(nomeModelo,new ValoresMetricas(av_result,rel_result,mttf_result,mttr_result));
                }
            });
            threads[i].start();
        }
        for(var i=0; i< len ; i++)
            threads[i].join();
        return map;
    }
    
    public static HashMap<String,HashMap<String,Double>> extrairMetricas(ExecutionRuntime runtime, HashMap<String,List<String>> subModelos) throws Exception {
        var map =  new HashMap<String,HashMap<String,Double>>();
        long i,f;
        i = System.currentTimeMillis();
        runAsync(runtime, subModelos, map);
        f = System.currentTimeMillis();
        System.out.println("tempo Async : " + (f-i) + " ms");
        i = System.currentTimeMillis();
        runSync(runtime, subModelos, map);
        f = System.currentTimeMillis();
        System.out.println("tempo sync : " + (f-i) + " ms");
        return map;
    }
    
    public static void runSync(ExecutionRuntime runtime, HashMap<String,List<String>> subModelos,HashMap<String,HashMap<String,Double>> map){
        for(var subModelo:subModelos.entrySet()){
            final var mapaMetricas = new HashMap<String, Double>();
            //log.info("modelo : " + subModelo.getKey());
            final var modelo = runtime.getModel(subModelo.getKey());
            final var iSubModelo = subModelo;
            for(var metrica:iSubModelo.getValue()){
                System.out.println("pegando a metrica [" + metrica + "] do modelo [" + subModelo.getKey() + "]");
                var sol = modelo.getMetric(metrica).solve();
                mapaMetricas.put(metrica, sol);
            }
            map.put(iSubModelo.getKey(),mapaMetricas);
        }
    }
    
    public static void runAsync(ExecutionRuntime runtime, HashMap<String,List<String>> subModelos,HashMap<String,HashMap<String,Double>> map) throws InterruptedException{
        var len = subModelos.size();
        var threads = new Thread[len];
        var i = 0;
        for(var subModelo:subModelos.entrySet()){
            final var ii = i;
            final var mapaMetricas = new HashMap<String, Double>();
            final var modelo = runtime.getModel(subModelo.getKey());
            final var iSubModelo = subModelo;
            threads[i] = new Thread(()->{
                var n = 0;
                var len2 = iSubModelo.getValue().size();
                var threads_2 = new Thread[len2];
                for(var metrica: iSubModelo.getValue()){
                    threads_2[n] = new Thread(()->{
                        var sol = modelo.getMetric(metrica).solve();
                        synchronized (mapaMetricas) {
                            mapaMetricas.put(metrica, sol);
                        }
                    });
                    threads_2[n++].start();
                }
                for(n=0; n< len2; n++)
                    try {
                        threads_2[n].join();
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }

                //System.out.println("pegando a metrica [" + metrica + "] do modelo [" + subModelo.getKey() + "]" );
                synchronized (map) {
                    map.put(iSubModelo.getKey(),mapaMetricas);
                }
            });
            threads[i++].start();
        }
        for(i=0; i<len ; i++){
            threads[i].join();
        }
    }
    
    public record ValoresMetricas(double av, double rel, double mttf, double mttr){}

}
