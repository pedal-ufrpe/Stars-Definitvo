package rode.rbd.modelo.composicao;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Pau no seu cu
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class JustRBD extends ComposicaoRBD{


    private BlocoRBD bloco;
    public JustRBD( BlocoRBD bloco){
        this.bloco = bloco;
        nome = bloco.getNome();
    }
    @Override
    public String blocoAsString() {
        return bloco.getAsString();
    }

    @Override
    public String getBlocosAsStrings() {
        return blocoAsString();
    }
    @Override
    public String composicaoAsString() {
        return "";
    }

    public static JustRBD novo(BlocoRBD blocoRBD){
        return new JustRBD(blocoRBD);
    }
    public static JustRBD novo(String nome, double mttf, double mttr){
        return JustRBD.novo(new BlocoRBD(nome,mttf,mttr));
    }
    public static JustRBD novo(double mttf, double mttr){
        return JustRBD.novo(new BlocoRBD(mttf,mttr));
    }
}
