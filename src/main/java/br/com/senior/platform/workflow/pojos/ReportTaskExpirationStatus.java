package br.com.senior.platform.workflow.pojos;

/**
 * Situação atual da solicitação.
 */
public enum ReportTaskExpirationStatus {
    /**
     * Em progresso
     */
    InProgress,
    /**
     * Irá expirar
     */
    WillExpire,
    /**
     * Expirado
     */
    Expired
}
