package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetThirdPartyRequestByStatusInput {

    /**
     * Nome da Chave do Processo
     */
    @NonNull
    private String processKey;
    /**
     * Status da PendÊncia
     */
    @NonNull
    private PendencyType status;

}
