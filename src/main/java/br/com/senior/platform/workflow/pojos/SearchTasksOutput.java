package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SearchTasksOutput {
    /**
     * Lista de tarefas
     */
    public List<Task> tasks;
    /**
     * Total de registros
     */
    public Long total;
}
