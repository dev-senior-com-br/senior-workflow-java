package br.com.senior.platform.workflow.pojos;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa uma pendência de um processo.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pendency {

    @NonNull
    private ServiceFlowToken serviceFlowToken;
    @NonNull
    private String description;
    @NonNull
    private String hint;
    @NonNull
    private ServiceSubject currentSubject;
    @NonNull
    private ServiceSubject delegatorSubject;
    @NonNull
    private Instant startDate;
    @NonNull
    private Instant lastUpdateDate;
    @NonNull
    private Instant expirationDate;
    @NonNull
    private String performerId;
    @NonNull
    private ProcessInstance processInstance;
    @NonNull
    private PendencyType type;
    @NonNull
    private Boolean pool;
    private String title;

}
