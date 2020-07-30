package br.com.senior.platform.workflow.pojos;

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
    public java.util.List<Order> orders;
}
