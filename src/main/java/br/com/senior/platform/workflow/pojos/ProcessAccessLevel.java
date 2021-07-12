package br.com.senior.platform.workflow.pojos;

/**
 * Nível de acesso ao processo
 */
public enum ProcessAccessLevel {
    /**
     * Editar e iniciar
     */
    EDIT_AND_START,
    /**
     * Iniciar
     */
    START,
    /**
     * Editar
     */
    EDIT,
    /**
     * Nenhuma
     */
    NONE
}
