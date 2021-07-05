package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da query getNextSubjectFromInitialTask.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetNextSubjectFromInitialTaskInput {

    /**
     * Identificador do processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão do processo
     */
    @NonNull
    private Integer processVersion;
    /**
     * Nome da sequência do Processo Modelador
     */
    @NonNull
    private String sequenceName;
    /**
     * Parâmetros para Mecanismo Customizado
     */
    private List<KeyValueRecord> customParams;
    /**
     * Token de autenticação da G7
     */
    private String authorization;

}
