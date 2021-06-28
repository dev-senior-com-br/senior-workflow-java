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
public class ChangePendencyUserInput {

    /**
     * Lista dos identificadores da tarefas
     */
    @NonNull
    private List<ServiceFlowToken> serviceFlowTokens;
    /**
     * Usuário, grupo ou papel alterar o responsável
     */
    @NonNull
    private ServiceSubject subject;

}
