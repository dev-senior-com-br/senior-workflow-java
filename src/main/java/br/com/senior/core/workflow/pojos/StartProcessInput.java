package br.com.senior.core.workflow.pojos;

public class StartProcessInput {
    
    /**
     * Quando o usuário quer definir o número da instância do processo.
     */
    public Long processInstanceID;
    /**
     * Número do processo
     */
    public Long processId;
    /**
     * Versão do Processo
     */
    public Long processVersion;
    /**
     * Variáveis de Negócio do Processo
     */
    public String businessData;
    /**
     * Informação para Fluxo de Execução do Processo
     */
    public FlowExecutionData flowExecutionData;
    /**
     * String de autorização executados da tarefas do workflow
     */
    public String authorization;
    /**
     * Título opcional da solicitação
     */
    public String title;
    /**
     * Usuário solicitante
     */
    public String requester;
    
    public StartProcessInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public StartProcessInput(Long processInstanceID, Long processId, Long processVersion, String businessData, FlowExecutionData flowExecutionData, String authorization, String title, String requester) {
        this.processInstanceID = processInstanceID;
        this.processId = processId;
        this.processVersion = processVersion;
        this.businessData = businessData;
        this.flowExecutionData = flowExecutionData;
        this.authorization = authorization;
        this.title = title;
        this.requester = requester;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public StartProcessInput(Long processId, String businessData, FlowExecutionData flowExecutionData) {
        this.processId = processId;
        this.businessData = businessData;
        this.flowExecutionData = flowExecutionData;
    }
}
