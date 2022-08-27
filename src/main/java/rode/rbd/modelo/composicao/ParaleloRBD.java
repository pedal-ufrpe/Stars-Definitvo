package rode.rbd.modelo.composicao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ParaleloRBD extends ComposicaoRBD{
    private static long count = 0;
    protected final long _id;
    public ParaleloRBD(){
        this._id = ++count;
        nome = "p" + _id;
    }
    @Override
    public String blocoAsString() {
        return getBlocosAsStrings();
    }
    @Override
    public String composicaoAsString() {
        String componentesEmSerie = composicoes.stream()
                .map(ComposicaoRBD::getNome)
                .collect(Collectors.joining(", "));
        return _getComposicaoAsString() + "\tparallel " + nome + '(' + componentesEmSerie + ");\n";
    }

    public static ParaleloRBD novo( ComposicaoRBD ... composicaoRBDS){
        ParaleloRBD p = new ParaleloRBD();
        p.addAll(new LinkedList<>(Arrays.asList(composicaoRBDS)));
        return p;
    }
}
