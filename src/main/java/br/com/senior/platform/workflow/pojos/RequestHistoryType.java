package br.com.senior.platform.workflow.pojos;

/**
 * Tipo de entrada no histórico de uma solicitação.
 */
public enum RequestHistoryType {
    /**
     * Solicitação iniciada
     */
    STARTED,
    /**
     * Inclusão de comentário
     */
    COMMENT,
    /**
     * Anexo incluído
     */
    ATTACHMENT_ADDED,
    /**
     * Anexo removido
     */
    ATTACHMENT_REMOVED,
    /**
     * Gestor do processos alterou o responsável
     */
    CHANGE_RESPONSIBLE,
    /**
     * Solicitação cancelada
     */
    CANCEL_PENDENCY,
    /**
     * Pendência da solicitação respondida
     */
    RESPONSE_PENDENCY,
    /**
     * Solicitação encerrada
     */
    FINISHED
}
