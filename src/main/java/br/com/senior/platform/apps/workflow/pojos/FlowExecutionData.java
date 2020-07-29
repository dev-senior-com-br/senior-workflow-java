package br.com.senior.platform.apps.workflow.pojos;

/**
 * Dados para a execução do fluxo
 */
public class FlowExecutionData {
    
    /**
     * Nome da ação a ser tomada dentro do fluxo
     */
    public String actionToExecute;
    /**
     * Usuário que pode receber a próxima ação
     */
    public String nextSubject;
    
    public FlowExecutionData() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public FlowExecutionData(String actionToExecute, String nextSubject) {
        this.actionToExecute = actionToExecute;
        this.nextSubject = nextSubject;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public FlowExecutionData(String actionToExecute) {
        this.actionToExecute = actionToExecute;
    }
}
