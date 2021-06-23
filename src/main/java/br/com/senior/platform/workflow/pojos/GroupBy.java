package br.com.senior.platform.workflow.pojos;

/**
 * Tipo de agrupamento
 */
public enum GroupBy {
    /**
     * Por processo
     */
    PROCESS,
    /**
     * Por categoria de processo
     */
    CATEGORY,
    /**
     * Por solicitante
     */
    REQUESTER,
    /**
     * Por responsável
     */
    RESPONSIBLE,
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
    EXPIRATION_DATE
}
