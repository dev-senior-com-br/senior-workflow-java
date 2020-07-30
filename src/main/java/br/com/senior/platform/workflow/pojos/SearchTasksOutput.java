package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SearchTasksOutput {
    /**
     * Lista de tarefas
     */
    public java.util.List<Task> tasks;
    /**
     * Total de registros
     */
    public Long total;
}
