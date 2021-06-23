package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetRequestHistoryTimelineInput {
    
    /**
     * Identificador da instância de Processo
     */
    public Long processInstanceID;

}
