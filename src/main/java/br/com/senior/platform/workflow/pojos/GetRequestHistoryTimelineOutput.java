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
public class GetRequestHistoryTimelineOutput {

    /**
     * Nome do processo
     */
    private String processName;
    /**
     * Representação da linha do tempo da solicitação
     */
    private List<RequestHistoryTimelineEntry> timeline;

}
