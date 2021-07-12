package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da action startProcess.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StartProcessInput {

    /**
     * Quando o usuário quer definir o número da instância do processo.
     */
    private Integer processInstanceID;
    /**
     * Caso seja passado o processInstanceId, indica que a geração do record deve 
     * ser feita pelo BPM e não foi gerenciada externamente.
     */
    private Boolean generateRecord;
    /**
     * Identificador do processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão do processo
     */
    private Integer processVersion;
    /**
     * Json com variáveis de negócio do processo. Ex: { "businessData": { "campo1": "valor1", "campo2": 2 }}
     */
    @NonNull
    private String businessData;
    /**
     * Informação para Fluxo de Execução do processo
     */
    @NonNull
    private FlowExecutionData flowExecutionData;
    /**
     * String de autorização das tarefas do workflow
     */
    private String authorization;
    /**
     * Título da solicitação
     */
    private String title;
    /**
     * Usuário solicitante
     */
    private String requester;
    /**
     * Se existir um serviço externo antes da primeira etapa, o mesmo deve 
     * sobrescrever as variáveis enviadas no businessData
     */
    private Boolean externalServiceOverrideBusinessData;

}
