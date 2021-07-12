package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da query searchTasks.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchTasksOutput {
    /**
     * Lista de tarefas
     */
    private List<Task> tasks;
    /**
     * Total de registros
     */
    private Integer total;
}
