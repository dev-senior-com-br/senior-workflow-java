package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Agrupamento
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    /**
     * Nome do agrupamento
     */
    @NonNull
    private Object name;
    /**
     * Lista de tarefas/solicitações do agrupamento
     */
    private List<Task> tasks;
    /**
     * Total de itens
     */
    @NonNull
    private Integer total;

}
