package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da action startProcess.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StartProcessOutput {

    /**
     * Identificador da instância de processo criada
     */
    private Integer processInstanceID;

}
