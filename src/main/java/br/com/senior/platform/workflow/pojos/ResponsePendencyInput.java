package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da action responsePendency.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePendencyInput {

    /**
     * Token do processo
     */
    @NonNull
    private ServiceFlowToken serviceFlowToken;
    /**
     * Dados de uma ação de resposta de pendência
     */
    private ResponseData responseData;
    /**
     * String de autorização executada da tarefa do workflow
     */
    private String authorization;
    /**
     * Comentário para solicitação
     */
    private String comment;

}
