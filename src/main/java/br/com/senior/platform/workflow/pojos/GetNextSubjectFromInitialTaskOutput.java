package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetNextSubjectFromInitialTaskOutput {
    
    /**
     * sujeitos que podem receber a atribuição
     */
    public List<ServiceSubject> subjects;
    /**
     * Depende da execução do próxima etapa para identificar a atribuição
     */
    public Boolean dependsOnNextStep;
    
    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public GetNextSubjectFromInitialTaskOutput(List<ServiceSubject> subjects) {
        this.subjects = subjects;
    }
    
}
