package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SearchTasksInput {
    /**
     * Filtros para pesquisa
     */
    public SearchTasksFilter filter;
    /**
     * Paginação
     */
    public Pagination pagination;
    /**
     * Ordenação
     */
    public List<Order> orders;
}
