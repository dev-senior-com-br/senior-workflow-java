package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Representa um objeto usado de parâmetro de entrada de alguns serviços.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PendencyRequestParameters {
    
    /**
     * Faixa inicial da consulta
     */
    public Long start;
    /**
     * Quantidade de linhas da consulta
     */
    public Long limit;
    /**
     * Tipo da pendência
     */
    public PendencyType type;
    /**
     * Filtro para buscar pelo nome da pendência ou valor das variáveis do processo
     */
    public String filterValue;
    /**
     * Filtro do tipo de processo (embarcado ou não)
     */
    public ProcessFilterType processFilterType;

}
