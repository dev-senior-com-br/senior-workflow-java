package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetRequestsResumeOutput {
    
    /**
     * Lista com resumo das solicitações
     */
    public List<MyRequestsResume> requestsResume;
    /**
     * Número Total de instância de processos
     */
    public Long total;

}
