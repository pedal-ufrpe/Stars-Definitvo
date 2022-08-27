package rode.rbd.modelo.composicao;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode
public abstract class ComposicaoRBD {
    protected ComposicaoRBD(){}
    protected LinkedList<ComposicaoRBD> composicoes = new LinkedList<>();
    protected String nome =  "";
    public String getBlocosAsStrings(){
        return composicoes.stream()
                .map(ComposicaoRBD::blocoAsString)
                .collect(Collectors.joining());
    }

    public abstract String blocoAsString();
    protected String _getComposicaoAsString(){
        return composicoes.stream()
                .map(ComposicaoRBD::composicaoAsString)
                .collect(Collectors.joining());
    }
    public abstract String composicaoAsString();
    public void add(ComposicaoRBD composicaoRBD){
        this.composicoes.add(composicaoRBD);
    }
    public void addAll(Collection<? extends ComposicaoRBD> composicaoRBDS){
        this.composicoes.addAll(composicaoRBDS);
    }


}
