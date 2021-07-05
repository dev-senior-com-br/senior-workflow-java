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
 * Representa uma instância de processo.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessInstance {
    
    /**
     * Identificador da instância 
     */
    @NonNull
    private Integer id;
    /**
     * Processo da instância
     */
    @NonNull
    private ServiceProcess process;
    /**
     * Quem iniciou a solicitação
     */
    @NonNull
    private ServiceSubject startedSubject;
    /**
     * Quem cancelou a solicitação
     */
    @NonNull
    private ServiceSubject cancelSubject;
    /**
     * Data de início
     */
    @NonNull
    private Instant startDate;
    /**
     * Data da última alteração
     */
    @NonNull
    private Instant lastUptadeDate;
    /**
     * Data de término
     */
    @NonNull
    private Instant endDate;
    @NonNull
    private String flowExecutionStatus;
    /**
     * Mensagem de enceramento
     */
    @NonNull
    private String endMessage;
    /**
     * Descrição da instância
     */
    @NonNull
    private String description;
    /**
     * Token do processo
     */
    @NonNull
    private List<ServiceFlowToken> flowToken;
    /**
     * Data de expiração
     */
    @NonNull
    private Instant taskExpiration;

}
