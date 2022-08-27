package rode.spn.trem;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import rode.spn.LugarSPN;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Data
@Log
public class Estacao implements Serializable, Cloneable{
    
    @Getter(AccessLevel.PRIVATE)
    private static long count = 0;
    private long id;
    private static LinkedList<String> nomes = new LinkedList<>();
    private LinkedList<Linha2> linhasAtuais;

    private String nome;
    private int numeroTrens;

    public Estacao(){
        this("Estacao_" + ++count);
        this.id = count;
    }
    public Estacao(String nome){
        this(nome,0);
    }

    public Estacao(String nome, int numeroTrens) {
        System.out.println("criando " + nome);
        synchronized (nomes){
            if(nomes.contains(nome))
                throw new IllegalArgumentException("nome j� existente");
        }
        linhasAtuais = new LinkedList<>();
        this.nome = nome;
        this.numeroTrens = numeroTrens;
    }

    public LugarSPN asLugar() {
        return new LugarSPN(nome, numeroTrens,true);
    }

    public LugarSPN asLugar(String sufixo) {
        return new LugarSPN(nome + '_' + sufixo, numeroTrens,true);
    }

    @Override
    public String toString() {
        return nome;
    }

    public String string() {
        var lins = linhasAtuais.stream().map(Linha2::string).collect(Collectors.joining(","));
        return "Estacao{nome=" + nome + ", numeroTrens=" + numeroTrens + ", linhas=[" + lins +"]}";
    }

    public void deletar() {
        //linhas.forEach(Linha::deletar);
    }
    public int getPartes(){
        return 3;
    }
    public Object getParte(int n){
        return this;
    }
}
