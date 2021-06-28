package br.com.senior.platform.workflow.pojos;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Resumo das Solicitações
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyRequestsResume {

    /**
     * Instância de Processo
     */
    @NonNull
    private Integer processInstanceId;
    /**
     * Nome do Processo
     */
    @NonNull
    private String processName;
    /**
     * Criação da Solicitação
     */
    @NonNull
    private Instant startDate;
    /**
     * Encerramento da Solicitação
     */
    @NonNull
    private Instant endDate;
    /**
     * Status
     */
    @NonNull
    private String status;
    /**
     * Nome da Atividade Atual
     */
    @NonNull
    private String activityName;
    /**
     * Usuário Atual da Tarefa
     */
    @NonNull
    private String taskUser;
    /**
     * Data de Expiração
     */
    @NonNull
    private Instant expirationDate;
    /**
     * Identificador do Processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão do Processo
     */
    @NonNull
    private Integer processVersion;
    /**
     * Indica se o processo desta solicitação é embarcado
     */
    @NonNull
    private Boolean embedded;
    /**
     * Detalhes da Solicitação
     */
    @NonNull
    private String detail;
    /**
     * Identificador de uma pendência.
     */
    private List<ServiceFlowToken> flowToken;

}
