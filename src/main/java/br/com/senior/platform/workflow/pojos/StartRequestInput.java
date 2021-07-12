package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da action startRequest.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StartRequestInput {

    /**
     * Identificador do processo
     */
    @NonNull
    private Integer processId;
    /**
     * Objeto com as variáveis de negócio do processo. Ex: businessData: { campo1: "valor1", campo2: 2 }
     */
    @NonNull
    private Object businessData;
    /**
     * Nome da ação a ser tomada dentro do fluxo. Obrigatório caso possua mais de uma ação possível
     */
    private String actionToExecute;
    /**
     * Responsável que vai receber a próxima ação, obrigatório caso o mecanismo de atribuição 
     * retorne mais de um responsável
     */
    private String nextSubject;
    /**
     * Token de autorização para integração com Serviços Externos, caso necessário
     */
    private String externalServiceAuthorization;
    /**
     * Título opcional da solicitação
     */
    private String title;
    /**
     * Usuário solicitante, caso a solicitação esteja sendo feita em nome de outro usuário
     */
    private String requester;

}
