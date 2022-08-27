package rode.spn;

import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(callSuper=false)
public class TransicaoExponencial extends Transicao implements Serializable {
    private static long count = 0;

    private double tempoMedio;

    public TransicaoExponencial(){
        this("T_" + ++count,new LugarSPN[0],new LugarSPN[0],new LugarSPN[0],0.1,true);
    }
    public TransicaoExponencial(String nome,LugarSPN[] entradas, LugarSPN[] saidas){
        super("timedTransition",nome,entradas,saidas,new LugarSPN[0],true);
        this.tempoMedio = 0.01;
    }

    public TransicaoExponencial(String nome,LugarSPN[] entradas, LugarSPN[] saidas,boolean desempenho){
        super("timedTransition",nome,entradas,saidas,new LugarSPN[0],desempenho);
        this.tempoMedio = 0.01;
    }

    public TransicaoExponencial(String nome, LugarSPN[] entradas, LugarSPN[] saidas, LugarSPN[] inbidores, double tempoMedio) {
        super("timedTransition",nome, entradas, saidas, inbidores,true);
        this.tempoMedio = tempoMedio;
    }

    public TransicaoExponencial(String nome, LugarSPN[] entradas, LugarSPN[] saidas, LugarSPN[] inbidores, double tempoMedio, boolean desempenho) {
        super("timedTransition",nome, entradas, saidas, inbidores,desempenho);
        this.tempoMedio = tempoMedio;
    }


    @Override
    public String getMry() {
        List<String> lista = entradas();
        lista.add(DELAY.formatted(tempoMedio));
        return mry(lista.stream());
    }
}
