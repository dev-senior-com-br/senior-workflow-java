package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Paginação
 */
@NoArgsConstructor
@AllArgsConstructor
public class Pagination {
    /**
     * Faixa inicial da consulta
     */
    public Long start = 0l;
    /**
     * Quantidade de linhas da consulta
     */
    public Long limit = 10l;
}
