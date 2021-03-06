package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da query findProcess.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FindProcessOutput {

    /**
     * Processo recuperado
     */
    private ServiceProcess process;

}
