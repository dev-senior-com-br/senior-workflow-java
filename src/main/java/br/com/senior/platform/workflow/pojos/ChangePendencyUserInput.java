package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * Objeto de entrada da action changePendencyUser.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangePendencyUserInput {

    /**
     * Lista dos identificadores das tarefas
     */
    @NonNull
    private List<ServiceFlowToken> serviceFlowTokens;
    /**
     * Usuário, grupo ou papel responsável
     */
    @NonNull
    private ServiceSubject subject;

}
