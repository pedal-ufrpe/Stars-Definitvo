/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rode.utilitario;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.modcs.tools.parser.model.ExecutionRuntime;
import org.modcs.tools.parser.model.Script;
import rode.spn.SPN;

/**
 *
 * @author rodemarck
 */
@Data
@AllArgsConstructor
public class Dados {
    private ExecutionRuntime runtime;
    private Script script;
    private SPN[] spns;
}
