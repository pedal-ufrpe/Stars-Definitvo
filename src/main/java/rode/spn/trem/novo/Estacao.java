package rode.spn.trem.novo;

import lombok.Data;
import rode.spn.LugarSPN;

import java.util.LinkedList;

@Data
public class Estacao {
    private Linha linha;
    private LinkedList<LugarSPN> lugares;
    private LinkedList<SegmentoLinha> vias;
}
