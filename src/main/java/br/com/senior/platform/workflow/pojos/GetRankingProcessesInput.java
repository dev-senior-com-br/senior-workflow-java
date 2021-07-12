package br.com.senior.platform.workflow.pojos;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de entrada da query getRankingProcesses.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRankingProcessesInput {

    /**
     * Data inicial para processar o ranking. Se não informada usa data atual menos 6 meses
     */
    private Instant start;
    /**
     * Data final para processar o ranking, se não informada usa data atual
     */
    private Instant end;
    /**
     * Número de processos que serão retornados. Valor padrão é 3.
     */
    private Integer limit;

}
