package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Ranking de Processos mais usados pelo usuário
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessRanking {

    /**
     * Identificador do Processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão Atual do Processo
     */
    @NonNull
    private Integer currentVersion;
    /**
     * Nome do Processo
     */
    @NonNull
    private String processName;
    /**
     * Tag agrupador de Processos
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
