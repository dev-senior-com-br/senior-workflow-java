package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetNextSubjectFromInitialTaskInput {
    
    /**
     * Identificador do Processo
     */
    public Long processId;
    /**
     * Versão do Processo
     */
    public Long processVersion;
    /**
     * Nome da Sequência do Processo Modelador
     */
    public String sequenceName;
    /**
     * Parâmetros para Mecanismo Customizado
     */
    public List<KeyValueRecord> customParams;
    /**
     * Token de autenticação da G7
     */
    public String authorization;
    
    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public GetNextSubjectFromInitialTaskInput(Long processId, Long processVersion, String sequenceName) {
        this.processId = processId;
        this.processVersion = processVersion;
        this.sequenceName = sequenceName;
    }
    
}
