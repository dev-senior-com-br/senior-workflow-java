package br.com.senior.platform.workflow.pojos;

/**
 * Tipo de entrada no histórico de um solicitação
 */
public enum RequestHistoryType {
    /**
     * Solicitação Iniciada
     */
    STARTED,
    /**
     * Inclusão de Comentário
     */
    COMMENT,
    /**
     * Anexo Incluído
     */
    ATTACHMENT_ADDED,
    /**
     * Anexo Removido
     */
    ATTACHMENT_REMOVED,
    /**
     * Gestor Processos alterou o responsável
     */
    CHANGE_RESPONSIBLE,
    /**
     * Solicitação Cancelada
     */
    CANCEL_PENDENCY,
    /**
     * Pendência da Solicitação Respondida
     */
    RESPONSE_PENDENCY,
    /**
     * Solicitação Encerrada
     */
    FINISHED
}
