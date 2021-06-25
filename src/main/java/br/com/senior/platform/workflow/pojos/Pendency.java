package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Representa uma pendência de um processo
 */
@NoArgsConstructor
@AllArgsConstructor
public class Pendency {
    
    public ServiceFlowToken serviceFlowToken;
    public String description;
    public String hint;
    public ServiceSubject currentSubject;
    public ServiceSubject delegatorSubject;
    public Date startDate;
    public Date lastUpdateDate;
    public Date expirationDate;
    public String performerId;
    public ProcessInstance processInstance;
    public PendencyType type;
    public Boolean pool;
    public String title;

    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public Pendency(ServiceFlowToken serviceFlowToken, String description, String hint, ServiceSubject currentSubject, ServiceSubject delegatorSubject, Date startDate, Date lastUpdateDate, Date expirationDate, String performerId, ProcessInstance processInstance, PendencyType type, Boolean pool) {
        this.serviceFlowToken = serviceFlowToken;
        this.description = description;
        this.hint = hint;
        this.currentSubject = currentSubject;
        this.delegatorSubject = delegatorSubject;
        this.startDate = startDate;
        this.lastUpdateDate = lastUpdateDate;
        this.expirationDate = expirationDate;
        this.performerId = performerId;
        this.processInstance = processInstance;
        this.type = type;
        this.pool = pool;
    }

}
