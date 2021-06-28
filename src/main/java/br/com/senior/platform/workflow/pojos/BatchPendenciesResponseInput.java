package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchPendenciesResponseInput {

    /**
     * Tokens das pendências
     */
    @NonNull
    private List<FlowToken> flowTokens;
    /**
     * Ação a ser executada
     */
    private String actionToExecute;
    /**
     * Token de autenticação
     */
    @NonNull
    private String authorization;

}
