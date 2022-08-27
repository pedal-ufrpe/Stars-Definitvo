package rode.spn.trem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trilho {
    private String nome;
    private boolean sentidoInverso;
    private double tempoMedio;

    private double mttr;
    private double mttf;

    public String string() {
        return "Trilho {\"" + nome + "\", |" + mttf + ',' + mttr + ": %1$s}";
    }
}
