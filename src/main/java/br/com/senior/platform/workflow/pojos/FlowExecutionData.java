package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Dados para a execução do fluxo
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowExecutionData {

    /**
     * Nome da ação a ser tomada dentro do fluxo
     */
    @NonNull
    private String actionToExecute;
    /**
     * Usuário que pode receber a próxima ação
     */
    private String nextSubject;

}
