package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ListTasksOutput {
    
    /**
     * Agrupamentos
     */
    public List<Group> groups;
    /**
     * Total de itens
     */
    public Long count;

    /** 
     * Construtor que possibilita a inicialização de todos os campos obrigatórios.
     */
    public ListTasksOutput(Long count) {
        this.count = count;
    }
}
