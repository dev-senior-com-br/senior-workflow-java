package br.com.senior.core.workflow.pojos;

public class StartProcessOutput {
    
    /**
     * Instância de Processo criada
     */
    public Long processInstanceID;
    
    public StartProcessOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public StartProcessOutput(Long processInstanceID) {
        this.processInstanceID = processInstanceID;
    }
}
