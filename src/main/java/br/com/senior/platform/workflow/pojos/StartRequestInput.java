package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class StartRequestInput {
    
    /**
     * Identificador do processo
     */
    public Long processId;
    /**
     * Objeto com as variáveis de Negócio do Processo. Ex: businessData: { campo1: "valor1", campo2: 2 }
     */
    public Object businessData;
    /**
     * Nome da ação a ser tomada dentro do fluxo. Obrigatório caso possua mais de uma ação possível
     */
    public String actionToExecute;
    /**
     * Responsável que vai receber a próxima ação, obrigatório caso o mecanismo de atribuição retorne mais de um responsável
     */
    public String nextSubject;
    /**
     * Token de autorização para integração com Serviços Externos, caso necessário
     */
    public String externalServiceAuthorization;
    /**
     * Título opcional da solicitação
     */
    public String title;
    /**
     * Usuário solicitante, caso a solicitação esteja sendo feita em nome de outro usuário
     */
    public String requester;

    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public StartRequestInput(Long processId, Object businessData) {
        this.processId = processId;
        this.businessData = businessData;
    }

}
