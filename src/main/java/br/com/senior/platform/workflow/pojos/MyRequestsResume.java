package br.com.senior.platform.workflow.pojos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Resumo das Solicitações
 */
@NoArgsConstructor
@AllArgsConstructor
public class MyRequestsResume {
    
    /**
     * Instância de Processo
     */
    public Long processInstanceId;
    /**
     * Nome do Processo
     */
    public String processName;
    /**
     * Criação da Solicitação
     */
    public Date startDate;
    /**
     * Encerramento da Solicitação
     */
    public Date endDate;
    /**
     * Status
     */
    public String status;
    /**
     * Nome da Atividade Atual
     */
    public String activityName;
    /**
     * Usuário Atual da Tarefa
     */
    public String taskUser;
    /**
     * Data de Expiração
     */
    public Date expirationDate;
    /**
     * Identificador do Processo
     */
    public Long processId;
    /**
     * Versão do Processo
     */
    public Long processVersion;
    /**
     * Indica se o processo desta solicitação é embarcado
     */
    public Boolean embedded;
    /**
     * Detalhes da Solicitação
     */
    public String detail;
    /**
     * Identificador de uma pendência.
     */
    public List<ServiceFlowToken> flowToken;

    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public MyRequestsResume(Long processInstanceId, String processName, Date startDate, Date endDate, String status, String activityName, String taskUser, Date expirationDate, Long processId, Long processVersion, Boolean embedded, String detail) {
        this.processInstanceId = processInstanceId;
        this.processName = processName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.activityName = activityName;
        this.taskUser = taskUser;
        this.expirationDate = expirationDate;
        this.processId = processId;
        this.processVersion = processVersion;
        this.embedded = embedded;
        this.detail = detail;
    }

}
