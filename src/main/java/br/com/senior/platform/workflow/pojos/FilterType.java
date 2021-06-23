package br.com.senior.platform.workflow.pojos;

/**
 * Tipo de filtro
 */
public enum FilterType {
    /**
     * Identificador da instância de processo
     */
    PROCESS_INSTANCE_ID,
    /**
     * Por solicitante
     */
    REQUESTER,
    /**
     * Por responsável
     */
    RESPONSIBLE,
    /**
     * Por status
     */
    STATUS,
    /**
     * Por data inicial
     */
    START_DATE,
    /**
     * Por data final
     */
    END_DATE,
    /**
     * Por data de expiração
     */
    EXPIRATION_DATE,
    /**
     * Data de expiração maior que a data informada
     */
    EXPIRATION_DATE_GT,
    /**
     * Data de expiração menor que a data informada
     */
    EXPIRATION_DATE_LT,
    /**
     * Por processo
     */
    PROCESS,
    /**
     * Nome da tarefa
     */
    TASK_NAME,
    /**
     * Assunto da solicitação
     */
    REQUEST_TITLE,
    /**
     * Por campo do formulário
     */
    FIELD
}
