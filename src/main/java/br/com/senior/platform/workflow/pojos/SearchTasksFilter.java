package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Filtro de tarefas.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchTasksFilter {
    /**
     * Filtrar pelo solicitante
     */
    private List<String> requesters;
    /**
     * Filtrar pelo identificador da solicitação
     */
    private List<String> requests;
    /**
     * Filtrar pelo identificador do processo
     */
    private List<String> processes;
    /**
     * Filtrar pelo status
     */
    private List<String> statuses;
}
