package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRequestsResumeInput {

    /**
     * Faixa inicial da consulta
     */
    private Integer start;
    /**
     * Quantidade de linhas da consulta
     */
    private Integer limit;
    /**
     * Filtro com lista de processos separado por virgula
     */
    private List<Integer> filterProcess;
    /**
     * Filtro para buscar pelo nome da pendência ou valor das variáveis do processo
     */
    private String filterValue;
    /**
     * Filtro por status
     */
    private List<MyRequestKind> filter;
    private List<KeyValueRecord> orders;
    private ReportTaskExpirationStatus situation;

}
