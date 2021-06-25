package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Assinatura corrigindo o processInstanceID presente em serviceFlowToken
 */
@NoArgsConstructor
@AllArgsConstructor
public class FlowToken {
    
    /**
     * Identificador da Instância do Processo
     */
    public Long processInstanceId;
    /**
     * Identificador da Etapa do Processo
     */
    public Long step;
    /**
     * Identificador da Atividade
     */
    public Long activityId;

}
