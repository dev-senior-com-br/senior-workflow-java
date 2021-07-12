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
 * Resumo de uma solicitação.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyRequestsResume {

    /**
     * Identificador da instância do processo
     */
    @NonNull
    private Integer processInstanceId;
    /**
     * Nome do processo
     */
    @NonNull
    private String processName;
    /**
     * Data de criação da soliciatção
     */
    @NonNull
    private Instant startDate;
    /**
     * Data de enceramento da solicitação
     */
    @NonNull
    private Instant endDate;
    /**
     * Status da solicitação
     */
    @NonNull
    private String status;
    /**
     * Nome da atividade atual
     */
    @NonNull
    private String activityName;
    /**
     * Usuário atual da tarefa
     */
    @NonNull
    private String taskUser;
    /**
     * Data de expiração
     */
    @NonNull
    private Instant expirationDate;
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
     * Indica se o processo desta solicitação é integrado ou não
     */
    @NonNull
    private Boolean embedded;
    /**
     * Detalhes da solicitação
     */
    @NonNull
    private String detail;
    /**
     * Identificador de uma pendência.
     */
    private List<ServiceFlowToken> flowToken;

}
