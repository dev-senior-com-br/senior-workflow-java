package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetRequestsResumeInput {
    
    /**
     * Faixa inicial da consulta
     */
    public Long start;
    /**
     * Quantidade de linhas da consulta
     */
    public Long limit;
    /**
     * Filtro com lista de processos separado por virgula
     */
    public java.util.List<Long> filterProcess;
    /**
     * Filtro para buscar pelo nome da pendência ou valor das variáveis do processo
     */
    public String filterValue;
    /**
     * Filtro por status
     */
    public List<MyRequestKind> filter;
    public List<KeyValueRecord> orders;
    public ReportTaskExpirationStatus situation;

}
