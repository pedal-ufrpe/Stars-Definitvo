package rode.rbd.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import rode.rbd.modelo.composicao.ComposicaoRBD;
import rode.rbd.modelo.composicao.JustRBD;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;


/**
 * Classe que representa um modelo RBD
 */
@Data
@AllArgsConstructor
public class RBD {
    /**
     * nome do modelo
     */
    @NonNull
    private final String nome;
    
    /**
     * Composição dos blocos RBD
     * @see ComposicaoRBD
     */
    @NonNull
    private final ComposicaoRBD composicao;
    
    /**
     * Conjunto de métricas a serem avaliadas.
     */
    @NotNull
    private final HashMap<String, String> metricas;
    
    /**
     * Mapa de blocos, serve apenas como açucar
     */
    private HashMap<String,JustRBD> blocos;

    /**
     * Template do modelo (<i>hard codede</i>) para conversão
     * do modelo linguagem de script do merecury(<i>msl</i>);
     */
    private static final String MODELO = "RBD %1$s{\n" +
                                         "\n" +
                                         "%2$s\n" +
                                         "\n" +
                                         "    %4$s\n" +
                                         "\n" +
                                         "    top %3$s;\n" +
                                         "\n" +
                                         "    metric av = availability;\n" +
                                         "    metric rel = reliability( time = t );\n" +
                                         "    metric mttf = mttf;\n" +
                                         "    metric mttr = mttr;\n" +
                                         "}\n";

    /**
     * Retorna a representação dos blocos RBD deste modelo
     * na linguagem de script do merecury (<i>msl</i>). Bem como
     * os seus didatos a submodelos.
     *
     * @author Rodemarck
     * @return Modelo na linguagem msl
     *
     * <!--@serialData  Além do modelo propriamente dito,
     * retorna cada um dos blocos como um
     * sub-modelo unitario, apenas para questõe de
     * teste.-->
     *
     * @see #getMry(String, ComposicaoRBD)
     */
    public String getAsMry(){
        return getMry(nome,composicao) + "\n\n"
                + blocos.entrySet().stream()
                .map(stringJustRBDEntry -> getMry(stringJustRBDEntry.getKey(),stringJustRBDEntry.getValue()))
                .collect(Collectors.joining("\n\n"));
    }
    

    /**
     * Aplica o modelo no template para conversão na
     * linguagem de script do merecury (<i>msl</i>).
     *
     * @author Rodemarck
     * @param nome Nome do modelo RBD
     * @param composicao Composição de blocos RBD
     * @return String contendo modelo RBD na linguagem (<i>msl</i>)
     * @see RBD#MODELO
     */
    private String getMry(String nome, @NonNull ComposicaoRBD composicao){
        return MODELO.formatted(nome, composicao.getBlocosAsStrings(),
                        composicao.getNome(), composicao.composicaoAsString()
                    );
    }

    /**
     * Varre todos os componentes do modelo numa busca em largura
     * procurando componentes até chegar nos compoenente do tipo {@link JustRBD}
     * e salvando em {@link RBD#blocos}
     */
    public void varreComponentes(){
        LinkedList<ComposicaoRBD> composicaoRBDS = new LinkedList<>();
        blocos = new HashMap<>();
        LinkedList<String> nomeComposicoes = new LinkedList<>();
        composicaoRBDS.add(composicao);
        while (!composicaoRBDS.isEmpty()){
            ComposicaoRBD comp = composicaoRBDS.pop();
            nomeComposicoes.add(comp.getNome());
            if( comp instanceof JustRBD) {
                JustRBD justRBD = (JustRBD) comp;
                blocos.put(nome + "_subModelo_" + justRBD.getNome(), justRBD);
            }
            comp.getComposicoes().stream()
                    .filter(c -> !nomeComposicoes.contains(c.getNome()))
                    .forEach(composicaoRBDS::add);
        }
    }
}
