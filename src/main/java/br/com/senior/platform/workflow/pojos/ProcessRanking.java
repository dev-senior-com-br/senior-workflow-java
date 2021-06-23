package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Ranking de Processos mais usados pelo usuário
 */
@NoArgsConstructor
@AllArgsConstructor
public class ProcessRanking {
    
    /**
     * Identificador do Processo
     */
    public Long processId;
    /**
     * Versão Atual do Processo
     */
    public Long currentVersion;
    /**
     * Nome do Processo
     */
    public String processName;
    /**
     * Tag agrupador de Processos
     */
    public String tag;
    /**
     * Ícone do processo
     */
    public String icon;
    /**
     * Descrição do processo
     */
    public String description;
    /**
     * Número de solicitações
     */
    public Long requests;

    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public ProcessRanking(Long processId, Long currentVersion, String processName, Long requests) {
        this.processId = processId;
        this.currentVersion = currentVersion;
        this.processName = processName;
        this.requests = requests;
    }
}
