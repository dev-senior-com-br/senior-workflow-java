package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa a chave de uma pendência de um processo. - Deprecado
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceFlowToken {

    /**
     * Identificador da Instância do Processo
     */
    @NonNull
    private Integer processInstanceID;
    /**
     * Identificador da Etapa do Processo
     */
    @NonNull
    private Integer step;
    /**
     * Identificador da Atividade
     */
    @NonNull
    private Integer activityId;

}
