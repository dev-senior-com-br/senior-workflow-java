package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Linha do tempo com o registro de ações e observações de uma solicitação
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestHistoryTimelineEntry {
    
    /**
     * Identificador da Instância do Processo
     */
    @NonNull
    private Integer processInstanceId;
    /**
     * Tipo de Entrada Histórico
     */
    @NonNull
    private RequestHistoryType historyType;
    /**
     * Data do Histórico
     */
    @NonNull
    private Date historyDate;
    /**
     * Usuário responsável
     */
    @NonNull
    private String userName;
    /**
     * Ação executada em nome do usuário
     */
    private String impersonatedUserName;
    /**
     * Nome da Tarefa
     */
    private String taskName;
    /**
     * Nome ação Executada
     */
    private String actionName;
    /**
     * Endereço IP do usuário
     */
    private String userIpAddress;
    /**
     * Comentário realizado na etapa do processo
     */
    private String comment;
    /**
     * Anexo
     */
    private String attachmentName;
    /**
     * Responsável anterior
     */
    @NonNull
    private String oldResponsible;
    /**
     * Novo responsável
     */
    @NonNull
    private String newResponsible;
    /**
     * Razão do cancelamento
     */
    private String cancelReason;

}
