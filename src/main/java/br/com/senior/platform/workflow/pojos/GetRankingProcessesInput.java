package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetRankingProcessesInput {
    
    /**
     * Data Inicial para processar o ranking. Se não informada usa data atual menos 6 meses
     */
    public Date start;
    /**
     * Data Final para processar o ranking, se não informada usa data atual
     */
    public Date end;
    /**
     * Especifica o número de processos para retornar. Valor padrão é 3.
     */
    public Long limit = 3L;

}
