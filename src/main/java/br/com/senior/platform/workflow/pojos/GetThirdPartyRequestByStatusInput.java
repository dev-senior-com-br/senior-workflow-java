package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da query getThirdPartyRequestByStatus.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetThirdPartyRequestByStatusInput {

    /**
     * Nome da chave do processo
     */
    @NonNull
    private String processKey;
    /**
     * Status da pendência
     */
    @NonNull
    private PendencyType status;

}
