package rode.spn.trem;

import lombok.AllArgsConstructor;
import lombok.Data;
import rode.spn.LugarSPN;
import rode.spn.SPN;
import rode.spn.Transicao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Data
//@AllArgsConstructor
public class SistemaFerroviario {
    private String nome;
    private List<Estacao> estacoes;
    //private List<Linha> linhas;

    public SPN asSPN(){
        /*List<SPN.mini> minis = linhas.stream()
                .map(Linha::caminhosComDisponibilidadeAsTransicao)
                .toList();
        final LinkedList<LugarSPN> lugares = new LinkedList<>(estacoes.stream()
                .map(Estacao::asLugar)
                .toList()
        );
        LinkedList<Transicao> transicoes = new LinkedList<>();
        minis.stream()
                .map(SPN.mini::transicoes)
                .forEach(lista -> lista.forEach(transicoes::add));
        minis.stream()
                .map(SPN.mini::lugares)
                .forEach(lista -> lista.forEach(lugares::addLast));

        return SPN.builder()
                .nome(nome)
                .lugares(lugares.toArray(new LugarSPN[lugares.size()]))
                .transicoes(transicoes.toArray(new Transicao[transicoes.size()]))
                .metricas(new HashMap<>())
                .build();*/
        return null;
    }

    public SistemaFerroviario(String nome, List<Estacao> estacoes){
        //this(nome,estacoes,gerarLinhas(estacoes));
    }
    public SistemaFerroviario(String nome, Estacao[] estacaos){
        this(nome, Arrays.asList(estacaos));
    }
    /*private static List<Linha> gerarLinhas(List<Estacao> estacos){
        final LinkedList<Linha> novasLinhas = new LinkedList<>();
        int len = estacos.size();
        for(int i=1; i < len; i++)
            novasLinhas.add(new Linha(estacos.get(i-1),estacos.get(i)));

        return novasLinhas;
    }*/
}
