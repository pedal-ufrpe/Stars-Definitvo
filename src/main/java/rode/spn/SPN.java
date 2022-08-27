package rode.spn;

import com.mxgraph.model.mxCell;
import lombok.Builder;
import lombok.Data;
import rode.spn.trem.Estacao;
import rode.spn.trem.Linha2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class SPN implements Serializable {
    private static final String MODELO = "SPN %1$s{\n" +
                                         "%2$s\n" +
                                         "\n" +
                                         "%3$s\n" +
                                         "\n" +
                                         "%4$s\n" +
                                         "}\n";
    private String nome;
    private LugarSPN[] lugares;
    private Transicao[] transicoes;

    private HashMap<String,String> metricas;


    public static SPN[] criar2(Object[] vertices, boolean disponibilidade){
        var ests = Arrays.stream(vertices)
                .filter(e -> ((mxCell)e).getValue() instanceof Estacao)
                .map(e -> (Estacao)((mxCell)e).getValue())
                .toList();
        var listas = ests.stream()
                .map(Estacao::getLinhasAtuais)
                .distinct()
                .toList();

        System.out.println("\n\n\n listas");
        var aux = new LinkedList<Linha2>();
        listas.forEach(l1->l1.forEach(aux::add));
        var linhas = new LinkedList<>(aux.stream().distinct().toList());
        var minis = disponibilidade ?
                linhas.stream().map(Linha2::caminhosAsTransicao).toList()
                :linhas.stream().map(Linha2::caminhosComDisponibilidadeAsTransicao).toList();

        return minis.toArray(new SPN[minis.size()]);
    }

    public String getAsMry(){
        var lugares = getLugares() == null ? ""
                :Arrays.stream(getLugares())
                .map(LugarSPN::getMry)
                .collect(Collectors.joining(""));

        var transicoes = getTransicoes() == null ? "" 
                :Arrays.stream(getTransicoes())
                .map(Transicao::getMry)
                .collect(Collectors.joining("\n"));

        var metricas = getMetricas() == null ? ""
                :getMetricas()
                    .entrySet()
                    .stream().map(e -> "\tmetric " + e.getKey() + " = stationaryAnalysis ( method = \"direct\", expression = \"" + e.getValue() + "\");")
                    .collect(Collectors.joining("\n"));

        return MODELO.formatted(nome,lugares,transicoes,metricas);
    }
    
    public void adicionaMetricaVelocidade(){
        if(metricas == null)
            metricas =  new HashMap<>();
        var str = mapeamendoEstacoes("(E{#%1$s})","+");
        var ir = Arrays.stream(transicoes)
                .filter(Transicao::isDesempenho)
                .filter(t -> t instanceof TransicaoExponencial)
                .findFirst();
        if(ir.isEmpty()) return;
        var t =(TransicaoExponencial) ir.get();
        str = "(" + str + "/" + "((E{#%1$s})/(%2$f)))".formatted(t.getEntradas()[0].getNome(),t.getTempoMedio() );
        metricas.put("velocidade",str);
    }
    public void printaMetricas(){
        System.out.println(nome + ":");
        metricas.forEach((a,b)-> System.out.println("\t" + a));
    }
    public String mapeamendoEstacoes(String mapeamento, String separador){
        return '(' + Arrays.stream(lugares)
                .filter(LugarSPN::isDesempenho)
                .map(l -> mapeamento.formatted(l.getNome()))
                .collect(Collectors.joining(separador)) + ')';
    }

    public void adicionaMetricaDisponibilidade() {
        if(metricas == null)
            metricas =  new HashMap<>();
        metricas.put("disponibilidade", mapeamendoEstacoes("(P{#%1$s_on=1})","AND"));
    }
    public void adicionaMetricaIntervaloEntreTrens(){
        if(metricas == null)
            metricas =  new HashMap<>();
        var str = mapeamendoEstacoes("(E{#%1$s})","+");
        var ir = Arrays.stream(transicoes)
                .filter(Transicao::isDesempenho)
                .filter(t -> t instanceof TransicaoExponencial)
                .findFirst();
        if(ir.isEmpty()) return;
        var t =(TransicaoExponencial) ir.get();
        str = "(" + str + "/((E{#%1$s})/(%2$f))/".formatted(t.getEntradas()[0].getNome(),t.getTempoMedio())+ str + ")" ;
        metricas.put("intervalo",str);

    }

    public void adicionaMetricaTempoEspera() {
        if(metricas == null)
            metricas =  new HashMap<>();
        var str = mapeamendoEstacoes("(E{#%1$s})","+");
        var ir = Arrays.stream(transicoes)
                .filter(Transicao::isDesempenho)
                .filter(t -> t instanceof TransicaoExponencial)
                .findFirst();
        if(ir.isEmpty()) return;
        var t =(TransicaoExponencial) ir.get();
        str = "((" + str + "/((E{#%1$s})/(%2$f))/".formatted(t.getEntradas()[0].getNome(),t.getTempoMedio()) + str + ")/2)" ;

        metricas.put("tempoEspera",str);
    }

    public static record mini(List<LugarSPN> lugares, List<Transicao> transicoes){}
}
