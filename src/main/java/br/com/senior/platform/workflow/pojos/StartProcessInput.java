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
public class StartProcessInput {

    /**
     * Quando o usuário quer definir o número da instância do processo.
     */
    private Integer processInstanceID;
    /**
     * Caso seja passado o processInstanceId, indica que a geração do record deve ser feita pelo BPM e não foi gerenciada externamente.
     */
    private Boolean generateRecord;
    /**
     * Número do processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão do Processo
     */
    private Integer processVersion;
    /**
     * Variáveis de Negócio do Processo
     */
    @NonNull
    private String businessData;
    /**
     * Informação para Fluxo de Execução do Processo
     */
    @NonNull
    private FlowExecutionData flowExecutionData;
    /**
     * String de autorização executados da tarefas do workflow
     */
    private String authorization;
    /**
     * Título opcional da solicitação
     */
    private String title;
    /**
     * Usuário solicitante
     */
    private String requester;
    /**
     * Se existir um serviço externo antes da primeira etapa, o mesmo deve sobrescrever as variáveis enviadas no businessData
     */
    private Boolean externalServiceOverrideBusinessData;

}
