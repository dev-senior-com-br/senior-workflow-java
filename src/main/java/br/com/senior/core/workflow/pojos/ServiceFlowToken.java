package br.com.senior.core.workflow.pojos;

/**
 * Representa a chave de uma pendência de um processo. - Deprecado
 */
public class ServiceFlowToken {
    
    /**
     * Identificador da Instância do Proceso
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
    
    public ServiceFlowToken() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ServiceFlowToken(Long processInstanceID, Long step, Long activityId) {
        this.processInstanceID = processInstanceID;
        this.step = step;
        this.activityId = activityId;
    }
}
