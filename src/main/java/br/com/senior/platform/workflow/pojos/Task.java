package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Tarefa
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Task {
    /**
     * Id do processo
     */
    public Long processId;
    /**
     * Nome do processo
     */
    public String processName;
    /**
     * Id da instância do processo
     */
    public Long processInstanceId;
    /**
     * Atividade
     */
    public String activity;
    /**
     * Detalhes do processo
     */
    public String detail;
    /**
     * Data de início da tarefa/processo
     */
    public Date startDate;
    /**
     * Data de fim da tarefa/processo
     */
    public Date endDate;
    /**
     * Data de expiração da tarefa/processo
     */
    public Date expirationDate;
    /**
     * Nome do responsável pela tarefa
     */
    public String responsableName;
    /**
     * Nome e sobrenome do responsável pela tarefa
     */
    public String responsableFullName;
    /**
     * Nome do solicitante
     */
    public String requesterName;
    /**
     * Status da tarefa
     */
    public TaskStatus taskStatus;
    /**
     * Status da solicitação
     */
    public MyRequestKind requestStatus;
    /**
     * Título da Solicitação
     */
    public String title;
    /**
     * Id da atividade
     */
    public Long activityId;
    /**
     * Passo
     */
    public Long step;
    /**
     * Número de pendências de uma solicitação
     */
    public Long pendencyCount;
    /**
     * Estado da pendência em lote
     */
    public PendencyResponseStatus responseStatus;
    
    /** 
     * Construtor que possibilita a inicialização de todos os campos obrigatórios.
     */
    public Task(Long processId, Long processInstanceId, String activity, Date startDate, String requesterName, Long activityId, Long step, Long pendencyCount, PendencyResponseStatus responseStatus) {
        this.processId = processId;
        this.processInstanceId = processInstanceId;
        this.activity = activity;
        this.startDate = startDate;
        this.requesterName = requesterName;
        this.activityId = activityId;
        this.step = step;
        this.pendencyCount = pendencyCount;
        this.responseStatus = responseStatus;
    }
}
