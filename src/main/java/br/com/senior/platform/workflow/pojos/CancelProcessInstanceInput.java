package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * Objeto de entrada da action cancelProcessInstance.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelProcessInstanceInput {

    /**
     * Identificadores das instâncias de processo a serem canceladas.
     */
    @NonNull
    private List<Integer> ids;
    /**
     * Usuário responsável pelo cancelamento. Deve ser informado quando for 
     * uma aplicação, quando não for aplicação esse campo é ignorado
     */
    private String user;
    /**
     * Motivo do cancelamento.
     */
    @NonNull
    private String reason;

}
