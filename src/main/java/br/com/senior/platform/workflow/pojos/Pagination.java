package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Paginação.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Pagination {
    /**
     * Índice inicial da consulta
     */
    private Integer start;
    /**
     * Quantidade de itens da consulta
     */
    private Integer limit;
}
