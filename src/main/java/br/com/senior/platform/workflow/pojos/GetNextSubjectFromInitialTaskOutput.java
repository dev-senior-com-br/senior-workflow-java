package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetNextSubjectFromInitialTaskOutput {

    /**
     * sujeitos que podem receber a atribuição
     */
    private List<ServiceSubject> subjects;
    /**
     * Depende da execução do próxima etapa para identificar a atribuição
     */
    private Boolean dependsOnNextStep;

}
