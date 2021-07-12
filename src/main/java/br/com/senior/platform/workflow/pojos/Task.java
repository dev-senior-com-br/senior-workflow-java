package br.com.senior.platform.workflow.pojos;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa uma tarefa de uma instância de processo.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    /**
     * Identificador do processo
     */
    @NonNull
    private Integer processId;
    /**
     * Nome do processo
     */
    private String processName;
    /**
     * Identificador da instância do processo
     */
    @NonNull
    private Integer processInstanceId;
    /**
     * Atividade
     */
    @NonNull
    private String activity;
    /**
     * Detalhes do processo
     */
    private String detail;
    /**
     * Data de início da tarefa/processo
     */
    @NonNull
    private Instant startDate;
    /**
     * Data de fim da tarefa/processo
     */
    private Instant endDate;
    /**
     * Data de expiração da tarefa/processo
     */
    private Instant expirationDate;
    /**
     * Nome do responsável pela tarefa
     */
    private String responsableName;
    /**
     * Nome e sobrenome do responsável pela tarefa
     */
    private String responsableFullName;
    /**
     * Nome do solicitante
     */
    @NonNull
    private String requesterName;
    /**
     * Status da tarefa
     */
    private TaskStatus taskStatus;
    /**
     * Status da solicitação
     */
    private MyRequestKind requestStatus;
    /**
     * Título da solicitação
     */
    private String title;
    /**
     * Identificador da atividade
     */
    @NonNull
    private Integer activityId;
    /**
     * Identificador da etapa
     */
    @NonNull
    private Integer step;
    /**
     * Número de pendências de uma solicitação
     */
    @NonNull
    private Integer pendencyCount;
    /**
     * Status da pendência
     */
    @NonNull
    private PendencyResponseStatus responseStatus;

}
