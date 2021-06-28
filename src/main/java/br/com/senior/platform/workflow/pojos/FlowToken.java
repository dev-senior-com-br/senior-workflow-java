package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Assinatura corrigindo o processInstanceID presente em serviceFlowToken
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowToken {

    /**
     * Identificador da Instância do Processo
     */
    @NonNull
    private Integer processInstanceId;
    /**
     * Identificador da Etapa do Processo
     */
    @NonNull
    private Integer step;
    /**
     * Identificador da Atividade
     */
    @NonNull
    private Integer activityId;

}
