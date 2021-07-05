package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representação corrigindo o processInstanceID presente no ServiceFlowToken.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowToken {

    /**
     * Identificador da instância do processo
     */
    @NonNull
    private Integer processInstanceId;
    /**
     * Identificador da Etapa do Processo
     */
    @NonNull
    private Integer step;
    /**
     * Identificador da atividade
     */
    @NonNull
    private Integer activityId;

}
