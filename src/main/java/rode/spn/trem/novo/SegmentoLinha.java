package rode.spn.trem.novo;

import lombok.AllArgsConstructor;
import lombok.Data;
import rode.spn.trem.Estacao;

@Data
@AllArgsConstructor
public class SegmentoLinha {
    private Estacao origem;
    private Estacao destino;
    private double tempoMedio;

    private double mttr;
    private double mttf;
}
