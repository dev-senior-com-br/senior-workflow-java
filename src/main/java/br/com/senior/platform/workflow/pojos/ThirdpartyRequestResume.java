package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Resumo das Solicitações com Integração Terceira
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThirdpartyRequestResume {
    
    /**
     * Identificador da pendência
     */
    @NonNull
    private ServiceFlowToken flowToken;
    /**
     * Identificador da aplicação terceira
     */
    private String thirdpartyId;
    /**
     * Dados das variáveis do processo
     */
    @NonNull
    private Object processData;

}
