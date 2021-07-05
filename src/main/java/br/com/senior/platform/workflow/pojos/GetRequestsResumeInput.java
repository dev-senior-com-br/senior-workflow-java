package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de entrada da query getRequestsResume.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRequestsResumeInput {

    /**
     * Índice inicial da consulta
     */
    private Integer start;
    /**
     * Quantidade de itens da consulta
     */
    private Integer limit;
    /**
     * Filtro com lista de identificadores de processos
     */
    private List<Integer> filterProcess;
    /**
     * Filtro para buscar pelo nome da pendência ou valor das variáveis do processo
     */
    private String filterValue;
    /**
     * Filtro por status da solicitação
     */
    private List<MyRequestKind> filter;
    /**
     * Lista com tipos de ordenação informando campo e tipo (asc ou desc)
     */
    private List<KeyValueRecord> orders;
    /**
     * Situação atual da solicitação
     */
    private ReportTaskExpirationStatus situation;

}
