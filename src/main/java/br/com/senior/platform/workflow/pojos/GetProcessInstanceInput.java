package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da query getProcessInstance.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetProcessInstanceInput {

    /**
     * Identificador da instância do processo
     */
    @NonNull
    private Integer processInstance;

}
