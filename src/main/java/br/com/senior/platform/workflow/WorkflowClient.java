package br.com.senior.platform.workflow;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.platform.utils.ApiPath;
import br.com.senior.platform.workflow.pojos.*;

public class WorkflowClient extends BaseClient {

    String token;

    public WorkflowClient(String token) {
        this(token, null);
    }

    public WorkflowClient(String token, Environment env) {
        super("platform", "workflow", env);
        this.token = token;
    }

    /**
     * Inicia um processo.
     *
     * @param payload - Payload de entrada com os dados para início do processo.
     * @return - Identificador da instância do processo iniciado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public Long startProcess(StartProcessInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Workflow.START_PROCESS), payload, token, StartProcessOutput.class).processInstanceID;
    }

    /**
     * Responde uma pendência.
     *
     * @param payload - Payload de entrada com os dados para responder uma pendência.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void responsePendency(ResponsePendencyInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Workflow.RESPONSE_PENDENCY), payload, token, Object.class);
    }

    /**
     * Cria uma nova representação de um anexo do Workflow.
     *
     * @param payload - Payload de entrada com os dados para criar uma nova representação de anexo.
     * @return - Payload de saída com os dados do anexo.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public NewAttachmentOutput newAttachment(NewAttachmentInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Workflow.NEW_ATTACHMENT), payload, token, NewAttachmentOutput.class);
    }

    /**
     * Faz commit de um anexo movendo ele da área temporária para permanente.
     *
     * @param payload - Payload de entrada com o identificador do anexo.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void commitAttachment(CommitAttachmentInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Workflow.COMMIT_ATTACHMENT), payload, token, Object.class);
    }

    /**
     * Liga determinados anexos a uma instância de processo.
     *
     * @param payload - Payload de entrada com os identificadores dos anexos e o identificador do processo.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void linkAttachments(LinkAttachmentsInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Workflow.LINK_ATTACHMENTS), payload, token, Object.class);
    }

    /**
     * Lista as tarefas que atendam aos filtros informados.
     *
     * @param payload - Payload de entrada para pesquisa de tarefas.
     * @return - Payload de saída com a lista de tarefas.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public SearchTasksOutput searchTasks(SearchTasksInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Workflow.SEARCH_TASKS), payload, token, SearchTasksOutput.class);
    }

    /**
     * Busca um processo do Workflow.
     * 
     * @param payload - Payload de entrada para buscar um processo.
     * @return - Payload de saída com o processo encontrado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public FindProcessOutput findProcess(FindProcessInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.FIND_PROCESS), payload, token, FindProcessOutput.class);
    }

    /**
     * Obtém os processos ativos que o usuário autenticado tem algum tipo de permissão.
     * 
     * @param payload - Payload de entrada para buscar os processos.
     * @return - Payload de saída com lista de processos recuperados.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetProcessesListOutput getProcessesList(GetProcessesListInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_PROCESSES_LIST), payload, token, GetProcessesListOutput.class);
    }

    /**
     * Obtém os processos mais utilizados pelo usuário no período especificado ou nos últimos seis meses se não especificado.
     * 
     * @param payload - Payload de entrada para buscar os processos.
     * @return - Payload de saída com lista de processos mais utilizados.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetRankingProcessesOutput getRankingProcesses(GetRankingProcessesInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_RANKING_PROCESSES), payload, token, GetRankingProcessesOutput.class);
    }

    /**
     * Obtém as informações de uma instância específica de um processo (um processo já iniciado).
     * 
     * @param payload - Payload de entrada para recuperar a instância do processo.
     * @return - Payload de saída com a instância do processo recuperada.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetProcessInstanceOutput getProcessInstance(GetProcessInstanceInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_PROCESS_INSTANCE), payload, token, GetProcessInstanceOutput.class);
    }

    /**
     * Cancela uma lista de processos que estejam em andamento.
     * 
     * @param payload - Payload de entrada com informações necessárias para cancelar os processos.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void cancelProcessInstance(CancelProcessInstanceInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Workflow.CANCEL_PROCESS_INSTANCE), payload, token, Object.class);
    }

    /**
     * Inicia uma solicitação no BPM.
     * 
     * @param payload - Payload de entrada com informações necessárias para iniciar uma solicitação.
     * @return - Payload de saída com informações da abertura da solicitação.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public StartRequestOutput startRequest(StartRequestInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Workflow.GET_PROCESS_INSTANCE), payload, token, StartRequestOutput.class);
    }
    
    /**
     * Obtém o resumo das solicitações que atendam aos filtros informados.
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar as solicitações.
     * @return - Payload de saída com lista de solicitações resumidas.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetRequestsResumeOutput getRequestsResume(GetRequestsResumeInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_REQUESTS_RESUME), payload, token, GetRequestsResumeOutput.class);
    }
    
    /**
     * Obtém uma linha do tempo com o registro de ações e observações de uma solicitação.
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar o histórico da solicitação.
     * @return - Payload de saída com histórico da solicitação.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetRequestHistoryTimelineOutput getRequestHistoryTimeline(GetRequestHistoryTimelineInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_REQUEST_HISTORY_TIMELINE), payload, token, GetRequestHistoryTimelineOutput.class);
    }

}
