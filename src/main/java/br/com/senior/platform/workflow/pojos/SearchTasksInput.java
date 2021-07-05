package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de entrada da query searchTasks.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchTasksInput {
    /**
     * Filtros para pesquisa
     */
    private SearchTasksFilter filter;
    /**
     * Paginação
     */
    private Pagination pagination;
    /**
     * Ordenação
     */
    private List<Order> orders;
}
