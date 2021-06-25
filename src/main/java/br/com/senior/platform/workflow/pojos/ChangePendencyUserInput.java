package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChangePendencyUserInput {
    
    /**
     * Lista dos identificadores da tarefas
     */
    public List<ServiceFlowToken> serviceFlowTokens;
    /**
     * Usuário, grupo ou papel alterar o responsável
     */
    public ServiceSubject subject;
    
}
