package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Representa a chave de uma pendência de um processo. - Deprecado
 */
@NoArgsConstructor
@AllArgsConstructor
public class ServiceFlowToken {
    
    /**
     * Identificador da Instância do Processo
     */
    public Long processInstanceID;
    /**
     * Identificador da Etapa do Processo
     */
    public Long step;
    /**
     * Identificador da Atividade
     */
    public Long activityId;

}
