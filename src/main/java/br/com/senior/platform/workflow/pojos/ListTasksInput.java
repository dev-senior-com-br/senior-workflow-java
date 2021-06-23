package br.com.senior.platform.workflow.pojos;

import java.util.List;

public class ListTasksInput {
    
    /**
     * Tipo de item da central de tarefas
     */
    public TaskListItemType kind;
    /**
     * Agrupado por
     */
    public GroupBy groupBy;
    /**
     * Filtros
     */
    public List<Filter> filters;
    /**
     * Ordenação
     */
    public List<Order> orders;
    /**
     * Início
     */
    public Long start;
    /**
     * Quantidade
     */
    public Long limit;
    /**
     * Faixa inicial da consulta de tarefas
     */
    public Long startTask;
    /**
     * Quantidade de tarefas da consulta
     */
    public Long limitTask;
    /**
     * Filtrar por grupo
     */
    public String group;
  
    /** 
     * Construtor que possibilita a inicialização de todos os campos obrigatórios.
     */
    public ListTasksInput(TaskListItemType kind, GroupBy groupBy, Long start, Long limit, Long startTask, Long limitTask) {
        this.kind = kind;
        this.groupBy = groupBy;
        this.start = start;
        this.limit = limit;
        this.startTask = startTask;
        this.limitTask = limitTask;
    }
}
