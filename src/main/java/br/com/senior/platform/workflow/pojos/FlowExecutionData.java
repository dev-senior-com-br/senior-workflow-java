package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Dados para a execução do fluxo
 */
@NoArgsConstructor
@AllArgsConstructor
public class FlowExecutionData {
    
    /**
     * Nome da ação a ser tomada dentro do fluxo
     */
    public String actionToExecute;
    /**
     * Usuário que pode receber a próxima ação
     */
    public String nextSubject;

    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public FlowExecutionData(String actionToExecute) {
        this.actionToExecute = actionToExecute;
    }
}
