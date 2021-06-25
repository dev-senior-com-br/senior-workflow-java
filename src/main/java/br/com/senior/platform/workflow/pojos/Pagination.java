package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;

/**
 * Paginação
 */
@AllArgsConstructor
public class Pagination {
    /**
     * Faixa inicial da consulta
     */
    public Long start;
    /**
     * Quantidade de linhas da consulta
     */
    public Long limit;
}
