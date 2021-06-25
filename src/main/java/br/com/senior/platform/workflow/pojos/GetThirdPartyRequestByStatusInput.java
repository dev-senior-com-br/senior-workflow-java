package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetThirdPartyRequestByStatusInput {
    
    /**
     * Nome da Chave do Processo
     */
    public String processKey;
    /**
     * Status da PendÊncia
     */
    public PendencyType status;

}
