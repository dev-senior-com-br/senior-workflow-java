package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Linha do tempo com o registro de ações e observações de uma solicitação
 */
@NoArgsConstructor
@AllArgsConstructor
public class RequestHistoryTimelineEntry {
    
    /**
     * Identificador da Instância do Processo
     */
    public Long processInstanceId;
    /**
     * Tipo de Entrada Histórico
     */
    public RequestHistoryType historyType;
    /**
     * Data do Histórico
     */
    public Date historyDate;
    /**
     * Usuário responsável
     */
    public String userName;
    /**
     * Ação executada em nome do usuário
     */
    public String impersonatedUserName;
    /**
     * Nome da Tarefa
     */
    public String taskName;
    /**
     * Nome ação Executada
     */
    public String actionName;
    /**
     * Endereço IP do usuário
     */
    public String userIpAddress;
    /**
     * Comentário realizado na etapa do processo
     */
    public String comment;
    /**
     * Anexo
     */
    public String attachmentName;
    /**
     * Responsável anterior
     */
    public String oldResponsible;
    /**
     * Novo responsável
     */
    public String newResponsible;
    /**
     * Razão do cancelamento
     */
    public String cancelReason;

    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public RequestHistoryTimelineEntry(Long processInstanceId, RequestHistoryType historyType, Date historyDate, String userName, String oldResponsible, String newResponsible) {
        this.processInstanceId = processInstanceId;
        this.historyType = historyType;
        this.historyDate = historyDate;
        this.userName = userName;
        this.oldResponsible = oldResponsible;
        this.newResponsible = newResponsible;
    }

}
