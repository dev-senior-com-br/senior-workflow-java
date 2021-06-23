package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetRequestHistoryTimelineOutput {
    
    /**
     * Nome do processo
     */
    public String processName;
    /**
     * Representação da linha do tempo da solicitação
     */
    public List<RequestHistoryTimelineEntry> timeline;

}
