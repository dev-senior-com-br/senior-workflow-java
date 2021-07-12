package br.com.senior.platform.workflow.pojos;

/**
 * Estado do upload do documento.
 */
public enum IntegrationStatus {
    /**
     * Upload em andamento
     */
    IN_PROGRESS,
    /**
     * Upload finalizado com sucesso
     */
    SUCCESS,
    /**
     * Upload finalizado com erro
     */
    ERROR
}
