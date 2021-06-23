package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Representa a entrada de dados de uma ação de resposta de pendência
 */
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
    
    /**
     * Dados de Negócio do Processo
     */
    public String businessData;
    /**
     * Informação para Fluxo de Execução do Processo
     */
    public FlowExecutionData flowExecutionData;

}
