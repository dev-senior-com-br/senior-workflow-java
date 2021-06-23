package br.com.senior.platform.workflow.pojos;

import java.util.List;

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
    public List<String> requesters;
    /**
     * Filtrar pelo identificador da solicitação
     */
    public List<String> requests;
    /**
     * Filtrar pelo identificador do processo
     */
    public List<String> processes;
    /**
     * Filtrar pelo status
     */
    public List<String> statuses;
}
