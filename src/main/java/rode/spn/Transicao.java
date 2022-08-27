package rode.spn;

import lombok.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Transicao implements Serializable {
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    protected String tipo;
    private String nome;
    private LugarSPN[] entradas;
    private LugarSPN[] saidas;
    private LugarSPN[] inbidores;
    private boolean desempenho;
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    protected static final String INPUTS = "\t\tinputs = [%1$s]";
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    protected static final String OUTPUT = "\t\toutputs = [%1$s]";
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    protected static final String INHIBITOR = "\t\tinhibitors = [%1$s]";
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    protected static final String DELAY = "\t\tdelay = %1$f";
    @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
    protected static final String MODELO = "\t%1$s %2$s(\n" +
                                           "%3$s\n" +
                                           "\t);\n";
    public abstract String getMry();

    protected String mry(Stream<String> ops){
        return MODELO.formatted(tipo, nome,
                ops.collect(Collectors.joining(",\n"))
        );
    }

    protected List<String> entradas(){

        String inputs =  entradas.length == 0 ?  ""
                :INPUTS.formatted(
                    Arrays.stream(entradas)
                        .map(LugarSPN::getNome)
                        .collect(Collectors.joining(","))
        );
        String outputs =  saidas.length == 0 ?  ""
                :OUTPUT.formatted(
                        Arrays.stream(saidas)
                            .map(LugarSPN::getNome)
                            .collect(Collectors.joining(","))
        );
        String inhibitors = inbidores.length == 0 ?  ""
                :INHIBITOR.formatted(
                        Arrays.stream(inbidores)
                            .map(LugarSPN::getNome)
                            .collect(Collectors.joining(","))
        );

        return new LinkedList<>(Stream.of(inputs,outputs,inhibitors)
                .filter(s -> !s.isBlank())
                .toList());
    }
}
