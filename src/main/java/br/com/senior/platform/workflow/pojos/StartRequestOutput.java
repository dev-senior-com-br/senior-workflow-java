package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StartRequestOutput {
    
    /**
     * Instância de Processo criada
     */
    private Integer processInstanceID;

}
