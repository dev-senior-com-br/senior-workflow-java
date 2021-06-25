package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class BatchPendenciesResponseInput {
    
    /**
     * Tokens das pendências
     */
    public List<FlowToken> flowTokens;
    /**
     * Ação a ser executada
     */
    public String actionToExecute;
    /**
     * Token de autenticação
     */
    public String authorization;
    
    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public BatchPendenciesResponseInput(java.util.List<FlowToken> flowTokens, String authorization) {
        this.flowTokens = flowTokens;
        this.authorization = authorization;
    }
    
}
