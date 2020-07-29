package br.com.senior.platform.apps.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
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

    /**
     * Construtor para inicialização de todos os campos obrigatórios.
     */
    public ResponsePendencyInput(ServiceFlowToken serviceFlowToken) {
        this.serviceFlowToken = serviceFlowToken;
    }
}
