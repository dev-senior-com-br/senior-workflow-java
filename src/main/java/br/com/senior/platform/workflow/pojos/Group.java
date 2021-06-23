package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Agrupamento
 */
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    
    /**
     * Nome do agrupamento
     */
    public Object name;
    /**
     * Lista de tarefas/solicitações do agrupamento
     */
    public List<Task> tasks;
    /**
     * Total de itens
     */
    public Long total;
    
    /** 
     * Construtor que possibilita a inicialização de todos os campos obrigatórios.
     */
    public Group(Object name, Long total) {
        this.name = name;
        this.total = total;
    }

}
