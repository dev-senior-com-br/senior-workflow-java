package br.com.senior.platform.workflow.pojos;

/**
 * Tipo de ordenação
 */
public enum OrderField {
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
     * Por nome do processo
     */
    PROCESS_NAME
}
