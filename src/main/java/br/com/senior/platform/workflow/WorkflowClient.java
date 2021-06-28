package br.com.senior.platform.workflow;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.platform.utils.ApiPath;
import br.com.senior.platform.workflow.pojos.*;

public class WorkflowClient extends BaseClient {

    private final String token;

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
     * @return - Payload de saída com  identificador da instância do processo iniciado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public StartProcessOutput startProcess(StartProcessInput payload) throws ServiceException {
        return execute(getActionsUrl(ApiPath.Workflow.START_PROCESS), payload, token, StartProcessOutput.class);
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
     * @param attachmentId - Identificador do anexo que deseja fazer commit.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void commitAttachment(String attachmentId) throws ServiceException {
        CommitAttachmentInput payload = new CommitAttachmentInput(attachmentId);
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
     * @param processId - Identificador do processo a ser recuperado.
     * @return - Payload de saída com o processo encontrado.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public FindProcessOutput findProcess(Integer processId) throws ServiceException {
        FindProcessInput payload = new FindProcessInput(processId);
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
     * @param processInstanceId - Identificador da instância do processo a ser recuperado.
     * @return - Payload de saída com a instância do processo recuperada.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetProcessInstanceOutput getProcessInstance(Integer processInstanceId) throws ServiceException {
        GetProcessInstanceInput payload = new GetProcessInstanceInput(processInstanceId);
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
        return execute(getActionsUrl(ApiPath.Workflow.START_REQUEST), payload, token, StartRequestOutput.class);
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
     * @param processInstanceId - Identificador da instância do processo do qual deseja recuperar o histórico de solicitação.
     * @return - Payload de saída com histórico da solicitação.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetRequestHistoryTimelineOutput getRequestHistoryTimeline(Integer processInstanceId) throws ServiceException {
        GetRequestHistoryTimelineInput payload = new GetRequestHistoryTimelineInput(processInstanceId);
        return execute(getQueriesUrl(ApiPath.Workflow.GET_REQUEST_HISTORY_TIMELINE), payload, token, GetRequestHistoryTimelineOutput.class);
    }
    
    /**
     * Lista as solicitações de aplicações terceiras por status.
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar as solicitações de aplicações terceiras.
     * @return - Payload de saída com lista de solicitações de aplicações terceiras.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetThirdPartyRequestByStatusOutput getThirdPartyRequestByStatus(GetThirdPartyRequestByStatusInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_THIRD_PARTY_REQUEST_BY_STATUS), payload, token, GetThirdPartyRequestByStatusOutput.class);
    }
    
    /**
     * Obtém os usuários e grupos conforme o tipo (usuário ou grupo).
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar os responsáveis por tipo.
     * @return - Payload de saída com lista de responsáveis.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetSubjectsOutput getSubjects(GetSubjectsInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_SUBJECTS), payload, token, GetSubjectsOutput.class);
    }
    
    /**
     * Obtém um ou mais responsáveis possíveis da próxima tarefa.
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar os responsáveis possíveis da próxima tarefa.
     * @return - Payload de saída com lista de responsáveis possíveis da próxima tarefa.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetNextSubjectOutput getNextSubject(GetNextSubjectInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_NEXT_SUBJECT), payload, token, GetNextSubjectOutput.class);
    }
    
    /**
     * Obtém um ou mais responsáveis possíveis da próxima tarefa em relação à tarefa inicial do processo.
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar os responsáveis possíveis da próxima tarefa.
     * @return - Payload de saída com lista de responsáveis possíveis da próxima tarefa.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetNextSubjectFromInitialTaskOutput getNextSubjectFromInitialTask(GetNextSubjectFromInitialTaskInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_NEXT_SUBJECT_FROM_INITIAL_TASK), payload, token, GetNextSubjectFromInitialTaskOutput.class);
    }
    
    /**
     * Responde pendências em lote executando uma das ações disponíveis.
     * 
     * @param payload - Payload de entrada com informações para responder a lista de pendências.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void batchPendenciesResponse(BatchPendenciesResponseInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Workflow.BATCH_PENDENCIES_RESPONSE), payload, token, Object.class);
    }

    /**
     * Atribui uma pendência para outro usuário.
     * 
     * @param payload - Payload de entrada com informações para realizar a troca do usuário da pendência.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public void changePendencyUser(ChangePendencyUserInput payload) throws ServiceException {
        execute(getActionsUrl(ApiPath.Workflow.CHANGE_PENDENCY_USER), payload, token, Object.class);
    }
    
    /**
     * Obtém as opções disponíveis para execução de uma pendência.
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar as opções disponíveis.
     * @return - Payload de saída com lista de opções disponíveis de uma pendência.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetPendencyProcessActionsOutput getPendencyProcessActions(GetPendencyProcessActionsInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_PENDENCY_PROCESS_ACTIONS), payload, token, GetPendencyProcessActionsOutput.class);
    }
    
    /**
     * Obtém as pendências do usuário autenticado conforme o tipo.
     * 
     * @param payload - Payload de entrada com informações necessárias para recuperar as pendências .
     * @return - Payload de saída com lista de opções disponíveis de uma pendência.
     * @throws ServiceException - Erro tratado do serviço.
     */
    public GetMyPendenciesOutput getMyPendencies(GetMyPendenciesInput payload) throws ServiceException {
        return execute(getQueriesUrl(ApiPath.Workflow.GET_MY_PENDENCIES), payload, token, GetMyPendenciesOutput.class);
    }
}
