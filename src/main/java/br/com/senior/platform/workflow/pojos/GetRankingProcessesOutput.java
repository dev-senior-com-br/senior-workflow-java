package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetRankingProcessesOutput {
    
    /**
     * Lista de Processos
     */
    public List<ProcessRanking> processes;

}
