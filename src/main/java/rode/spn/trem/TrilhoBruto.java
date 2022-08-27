package rode.spn.trem;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper=false)
public class TrilhoBruto extends Trilho implements Serializable {
    private Estacao destiono;
    private Estacao origem;
    public TrilhoBruto(String nome,Estacao origem, Estacao destino, boolean sentidoInverso, double tempoMedio, double mttr, double mttf) {
        super(nome, sentidoInverso, tempoMedio, mttr, mttf);
        this.origem = origem;
        this.destiono = destino;
    }

    public TrilhoBruto( Estacao destiono, Estacao origem) {
        super(null, false, 10, 100, 10);
        this.destiono = destiono;
        this.origem = origem;
    }
}
