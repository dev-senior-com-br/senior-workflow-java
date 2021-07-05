package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa a chave de uma pendência de um processo. - Deprecado
 * @see FlowToken
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceFlowToken {

    /**
     * Identificador da instância do orocesso
     */
    @NonNull
    private Integer processInstanceID;
    /**
     * Identificador da etapa do processo
     */
    @NonNull
    private Integer step;
    /**
     * Identificador da atividade
     */
    @NonNull
    private Integer activityId;

}
