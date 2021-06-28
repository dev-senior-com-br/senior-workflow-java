package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessAction {

    @NonNull
    private String name;
    @NonNull
    private String label;
    @NonNull
    private Boolean finish;
    @NonNull
    private Boolean connectsWithAutomaticGateway;
    @NonNull
    private Boolean isAppUser;

}
