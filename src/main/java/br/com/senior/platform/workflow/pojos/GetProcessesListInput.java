package br.com.senior.platform.workflow.pojos;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da query getProcessesList.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetProcessesListInput {

    /**
     * Tipo de ação que indica quais processos serão listados
     */
    @NonNull
    private ServiceType serviceAction;
    /**
     * Filtro por tipo de processo
     */
    private ProcessFilterType processFilterType;
    /**
     * Filtro por tag
     */
    private String tagFilter;
    /**
     * Apenas retorna processos ativos
     */
    private Boolean onlyActiveProcesses;
    /**
     * A partir de qual data buscar eventos de serviços externos
     */
    private Instant serviceEventStartDate;

}
