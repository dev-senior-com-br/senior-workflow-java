package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Paginação
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Pagination {
    /**
     * Faixa inicial da consulta
     */
    private Integer start;
    /**
     * Quantidade de linhas da consulta
     */
    private Integer limit;
}
