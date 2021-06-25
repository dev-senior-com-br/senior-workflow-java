package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetNextSubjectInput {
    
    /**
     * Token com informações da etapa do fluxo em andamento
     */
    public ServiceFlowToken serviceFlowToken;
    /**
     * Nome da Sequência do Processo Modelador
     */
    public String sequenceName;
    /**
     * Token de autenticação da G7
     */
    public String authorization;
    
    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public GetNextSubjectInput(ServiceFlowToken serviceFlowToken, String sequenceName) {
        this.serviceFlowToken = serviceFlowToken;
        this.sequenceName = sequenceName;
    }

}
