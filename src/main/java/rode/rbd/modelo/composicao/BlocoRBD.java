package rode.rbd.modelo.composicao;

import lombok.*;

@Data
public class BlocoRBD {
    @Setter(AccessLevel.NONE)
    private static long count = 0;
    private String nome;
    private double mttf;
    private double mttr;
    private double disponibilidade;
    private double importance;

    public BlocoRBD(String nome, double mttf, double mttr) {
        this.nome = 'b' + nome;
        this.mttf = mttf;
        this.mttr = mttr;
        this.importance = 0;
        this.disponibilidade = 0;
    }

    public BlocoRBD(double mttf, double mttr){
        this(Long.toString(++count)  , mttf,mttr);
    }

    public String getAsString(){
        return "\tblock " + nome + "( MTTF = " + mttf + ", MTTR = " +mttr + ");\n";
    }
}
