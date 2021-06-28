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
public class GetThirdPartyRequestByStatusOutput {

    /**
     * Solicitações Terceiras
     */
    private List<ThirdpartyRequestResume> requests;

}