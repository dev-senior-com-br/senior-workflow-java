package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Resumo das Solicitações com Integração Terceira
 */
@NoArgsConstructor
@AllArgsConstructor
public class ThirdpartyRequestResume {
    
    /**
     * Identificador da pendência
     */
    public ServiceFlowToken flowToken;
    /**
     * Identificador da aplicação terceira
     */
    public String thirdpartyId;
    /**
     * Dados das variáveis do processo
     */
    public Object processData;

    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public ThirdpartyRequestResume(ServiceFlowToken flowToken, Object processData) {
        this.flowToken = flowToken;
        this.processData = processData;
    }

}
