package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Ranking de Processos mais usados pelo usuário.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessRanking {

    /**
     * Identificador do processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão atual do processo
     */
    @NonNull
    private Integer currentVersion;
    /**
     * Nome do processo
     */
    @NonNull
    private String processName;
    /**
     * Tag agrupador de processos
     */
    private String tag;
    /**
     * Ícone do processo
     */
    private String icon;
    /**
     * Descrição do processo
     */
    private String description;
    /**
     * Número de solicitações
     */
    @NonNull
    private Integer requests;

}
