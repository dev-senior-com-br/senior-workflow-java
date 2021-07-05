package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da query getNextSubject.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetNextSubjectInput {

    /**
     * Token com informações da etapa do fluxo em andamento
     */
    @NonNull
    private ServiceFlowToken serviceFlowToken;
    /**
     * Nome da sequência do Processo Modelador
     */
    @NonNull
    private String sequenceName;
    /**
     * Token de autenticação da G7
     */
    private String authorization;

}
