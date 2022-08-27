package rode.spn.trem;

import lombok.Data;

import java.io.Serializable;

@Data
public class Via implements Serializable {
    private Estacao propria;
    private Estacao ida;
    private Trilho trilhoIda;
    private Estacao volta;
    private Trilho trilhoVolta;
    public Via(Estacao estacao){
        this.ida = estacao;
        this.propria = estacao;
        this.trilhoIda = new Trilho(estacao.getNome() + "_via_1",false,150,20,1500);
        this.volta = estacao;
        this.trilhoVolta = new Trilho(estacao.getNome() + "_via_2",false,150,20,1500);
    }
}
