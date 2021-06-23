package br.com.senior.platform.workflow.pojos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Representa uma instância de processo
 */
@NoArgsConstructor
@AllArgsConstructor
public class ProcessInstance {
    
    public Long id;
    public ServiceProcess process;
    public ServiceSubject startedSubject;
    public ServiceSubject cancelSubject;
    public Date startDate;
    public Date lastUptadeDate;
    public Date endDate;
    public String flowExecutionStatus;
    public String endMessage;
    public String description;
    public List<ServiceFlowToken> flowToken;
    public Date taskExpiration;

}
