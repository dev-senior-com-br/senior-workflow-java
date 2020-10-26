package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class StartProcessInput {

    /**
     * Quando o usuário quer definir o número da instância do processo.
     */
    public Long processInstanceID;
    /**
     * Número do processo
     */
    public Long processId;
    /**
     * Versão do Processo
     */
    public Long processVersion;
    /**
     * Variáveis de Negócio do Processo
     */
    public String businessData;
    /**
     * Informação para Fluxo de Execução do Processo
     */
    public FlowExecutionData flowExecutionData;
    /**
     * String de autorização executados da tarefas do workflow
     */
    public String authorization;
    /**
     * Título opcional da solicitação
     */
    public String title;
    /**
     * Usuário solicitante
     */
    public String requester;

    /**
     * Construtor para inicialização de todos os campos obrigatórios.
     */
    public StartProcessInput(Long processId, String businessData, FlowExecutionData flowExecutionData) {
        this.processId = processId;
        this.businessData = businessData;
        this.flowExecutionData = flowExecutionData;
    }
}
