package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representa um objeto usado de parâmetro de entrada de alguns serviços.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PendencyRequestParameters {
    
    /**
     * Faixa inicial da consulta
     */
    private Integer start;
    /**
     * Quantidade de linhas da consulta
     */
    private Integer limit;
    /**
     * Tipo da pendência
     */
    private PendencyType type;
    /**
     * Filtro para buscar pelo nome da pendência ou valor das variáveis do processo
     */
    private String filterValue;
    /**
     * Filtro do tipo de processo (integrado ou não)
     */
    private ProcessFilterType processFilterType;

}
