package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da query getPendencyProcessActions.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetPendencyProcessActionsInput {

    /**
     * Token com informações da etapa do fluxo
     */
    @NonNull
    private ServiceFlowToken serviceFlowToken;

}
