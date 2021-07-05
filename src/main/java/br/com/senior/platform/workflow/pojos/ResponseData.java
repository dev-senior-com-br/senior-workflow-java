package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representa a entrada de dados de uma ação de resposta de pendência.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {

    /**
     * Dados de negócio do processo. Ex: { "businessData": { "campo1": "valor1", "campo2": 2 }}
     */
    private String businessData;
    /**
     * Informação para Fluxo de Execução do processo
     */
    private FlowExecutionData flowExecutionData;

}
