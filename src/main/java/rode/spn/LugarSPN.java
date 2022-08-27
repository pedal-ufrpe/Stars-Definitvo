package rode.spn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class LugarSPN implements Serializable {
    private static final String MODELO = "\tplace %1$s%2$s;\n";
    private static final String PARAM = "(tokens = %1$d)";
    private final String nome;
    private int marcas;
    private boolean desempenho = true;

    public String getMry(){
        if (marcas > 0)
            return MODELO.formatted(nome,PARAM.formatted(marcas));
        return MODELO.formatted(nome,"");
    }
}
