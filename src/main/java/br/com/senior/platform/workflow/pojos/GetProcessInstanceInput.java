package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GetProcessInstanceInput {

    /**
     * Identificador da instância de Processo
     */
    @NonNull
    private Integer processInstance;

}
