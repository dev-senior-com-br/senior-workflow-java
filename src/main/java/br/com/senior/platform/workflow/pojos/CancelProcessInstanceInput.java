package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CancelProcessInstanceInput {
    
    /**
     * Identificadores das instâncias de processo a serem canceladas.
     */
    public List<Long> ids;
    /**
     * Usuário responsável pelo cancelamento. Deve ser informado quando for uma aplicação, quando não for aplicação esse campo é ignorado
     */
    public String user;
    /**
     * Motivo do cancelamento.
     */
    public String reason;
    
    /**
     * Construtor com todos os campos obrigatórios.
     * @param ids - Identificadores das instâncias de processo a serem canceladas.
     * @param reason - Motivo do cancelamento.
     */
    public CancelProcessInstanceInput(List<Long> ids, String reason) {
        this.ids = ids;
        this.reason = reason;
    }

}
