package br.com.senior.platform.apps.workflow.pojos;

public class StartProcessOutput {
    
    /**
     * Instância de Processo criada
     */
    public Long processInstanceID;
    
    public StartProcessOutput() {
    }
    
    /** 
     * Construtor para inicialização de todos os campos obrigatórios.
     */
    public StartProcessOutput(Long processInstanceID) {
        this.processInstanceID = processInstanceID;
    }
}
