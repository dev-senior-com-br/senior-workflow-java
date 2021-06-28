package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRankingProcessesInput {

    /**
     * Data Inicial para processar o ranking. Se não informada usa data atual menos 6 meses
     */
    private Date start;
    /**
     * Data Final para processar o ranking, se não informada usa data atual
     */
    private Date end;
    /**
     * Especifica o número de processos para retornar. Valor padrão é 3.
     */
    private Integer limit;

}
