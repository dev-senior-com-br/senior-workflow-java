package br.com.senior.core.workflow.pojos;

public class ResponsePendencyInput {
    
    /**
     * Token do Processo
     */
    public ServiceFlowToken serviceFlowToken;
    /**
     * Dados de uma ação de resposta de pendência
     */
    public ResponseData responseData;
    /**
     * String de autorização executada da tarefa do workflow
     */
    public String authorization;
    /**
     * Comentário para solicitação
     */
    public String comment;
    
    public ResponsePendencyInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ResponsePendencyInput(ServiceFlowToken serviceFlowToken, ResponseData responseData, String authorization, String comment) {
        this.serviceFlowToken = serviceFlowToken;
        this.responseData = responseData;
        this.authorization = authorization;
        this.comment = comment;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public ResponsePendencyInput(ServiceFlowToken serviceFlowToken) {
        this.serviceFlowToken = serviceFlowToken;
    }
}
