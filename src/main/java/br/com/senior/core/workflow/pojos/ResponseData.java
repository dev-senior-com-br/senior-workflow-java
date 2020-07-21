package br.com.senior.core.workflow.pojos;

/**
 * Representa a entrada de dados de uma ação de resposta de pendência
 */
public class ResponseData {
    
    /**
     * Dados de Negócio do Processo
     */
    public String businessData;
    /**
     * Informação para Fluxo de Execução do Processo
     */
    public FlowExecutionData flowExecutionData;
    
    public ResponseData() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ResponseData(String businessData, FlowExecutionData flowExecutionData) {
        this.businessData = businessData;
        this.flowExecutionData = flowExecutionData;
    }
}
