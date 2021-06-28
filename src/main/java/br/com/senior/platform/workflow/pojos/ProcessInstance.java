package br.com.senior.platform.workflow.pojos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa uma instância de processo
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessInstance {
    
    @NonNull
    private Integer id;
    @NonNull
    private ServiceProcess process;
    @NonNull
    private ServiceSubject startedSubject;
    @NonNull
    private ServiceSubject cancelSubject;
    @NonNull
    private Date startDate;
    @NonNull
    private Date lastUptadeDate;
    @NonNull
    private Date endDate;
    @NonNull
    private String flowExecutionStatus;
    @NonNull
    private String endMessage;
    @NonNull
    private String description;
    @NonNull
    private List<ServiceFlowToken> flowToken;
    @NonNull
    private Date taskExpiration;

}
