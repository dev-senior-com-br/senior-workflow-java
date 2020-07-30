package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Filtro de tarefas
 */
@NoArgsConstructor
@AllArgsConstructor
public class SearchTasksFilter {
    /**
     * Filtrar pelo solicitante
     */
    public java.util.List<String> requesters;
    /**
     * Filtrar pelo identificador da solicitação
     */
    public java.util.List<String> requests;
    /**
     * Filtrar pelo identificador do processo
     */
    public java.util.List<String> processes;
    /**
     * Filtrar pelo status
     */
    public java.util.List<String> statuses;
}
