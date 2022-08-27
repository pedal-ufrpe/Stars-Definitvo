package rode.rbd.modelo.composicao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class SerieRBD extends ComposicaoRBD{
    private static long count = 0;
    protected final long _id;
    public SerieRBD(){
        _id = ++count;
        nome = "s" + _id;
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
        return _getComposicaoAsString() + "\tseries " + nome + '(' + componentesEmSerie + ");\n";
    }
    public static SerieRBD novo( ComposicaoRBD ... composicaoRBDS){
        SerieRBD s = new SerieRBD();
        s.addAll(new LinkedList<>(Arrays.asList(composicaoRBDS)));
        return s;
    }
}
