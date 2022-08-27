package rode.spn.trem.novo;

import lombok.Data;

import java.util.LinkedList;

@Data
public final class Linha {
    private LinkedList<Estacao> estacoes;
    private Estacao estacaoPrincipal;
}
