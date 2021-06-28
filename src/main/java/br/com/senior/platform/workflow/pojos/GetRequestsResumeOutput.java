package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetRequestsResumeOutput {

    /**
     * Lista com resumo das solicitações
     */
    private List<MyRequestsResume> requestsResume;
    /**
     * Número Total de instância de processos
     */
    private Integer total;

}
