package br.com.senior.platform.workflow;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import br.com.senior.core.authentication.AuthenticationClient;
import br.com.senior.core.authentication.pojos.LoginInput;
import br.com.senior.core.authentication.pojos.LoginOutput;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.platform.workflow.WorkflowClient;
import br.com.senior.platform.workflow.pojos.*;

public class WorkflowClientExample {

    private static String accessToken;
    private static WorkflowClient workflowClient;

    public static void main(String[] args) throws ServiceException, IOException {
        accessToken = authenticate();

        workflowClient = new WorkflowClient(accessToken, Environment.HOMOLOG);

        // identificador de um processo previamente modelado e publicado no Workflow
        int processId = 5;
        
        printMessage("\nstartRequest...");
        
        // conteúdo do formulário da solicitação
        Map<String, Object> formData = new HashMap<>();
        formData.put("destino", "Curitiba");
        formData.put("partida", "2021-06-25");
        formData.put("retorno", "2021-06-28");
        formData.put("motivo", "Visita a cliente");
        
        // inicia uma solicitação, criando uma instância do processo
        // também é possível utilizar o startProcess(processId) para a mesma finalidade
        int processInstanceId = startRequest(processId, formData);
        
        // adiciona um anexo à solicitação criada
        NewAttachmentOutput newAttachmentOutput = newAttachment();
        uploadFile(newAttachmentOutput.getUploadUrl());
        commitAttachment(newAttachmentOutput.getAttachment().getId());
        linkAttachments(newAttachmentOutput.getAttachment().getId(), processInstanceId);

        // recupera lista de todos os processos
        getProcessesList();

        // recupera lista dos processos utilizados recentemente
        getRankingProcesses();

        // recupera os dados do processo de exemplo
        findProcess(processId);

        // recupera a solicitação (instância do processo) criada anteriormente
        getProcessInstance(processInstanceId);

        // recupera a lista de solicitações do processo de exemplo
        getRequestsResume(processId);

        // recupera o histórico da solicitação criada
        getRequestHistoryTimeline(processInstanceId);
        
        // lista as solicitações de aplicações terceiras
        getThirdPartyRequestByStatus();
        
        // recupera todos os possíveis responsáveis
        getSubjects();
        
        // recupera todos os possíveis responsáveis para a próxima tarefa
        getNextSubject(processInstanceId);
        getNextSubjectFromInitialTask(processId);
        
        // recupera lista de tarefas filtradas, neste caso, pelo 'processId'
        searchTasks(String.valueOf(processId));
        
        // recupera todas as pendências do usuário autenticado
        getMyPendencies();
        
        // recupera as ações possíveis para uma pendência
        getPendencyProcessActions(processInstanceId);
        
        // altera o usuário responsável pela solicitação
        changePendencyUser(processInstanceId);
        
        // responde uma pendência ou uma lista de pendências
        responsePendency(processInstanceId);
        batchPendenciesResponse(processInstanceId);
        
        // cancela a solicitação iniciada anteriormente
        cancelProcessInstance(processInstanceId);
    }
    
    private static Integer startRequest(int processId, Map<String, Object> formData) throws ServiceException {
        printMessage("\nstartRequest...");
        
        StartRequestInput payload = StartRequestInput.builder()
                .processId(processId)
                .businessData(formData)
                .build();
        
        StartRequestOutput output = workflowClient.startRequest(payload);

        printMessage("Process Instance Id: " + output.getProcessInstanceID());
        return output.getProcessInstanceID();
    }
    
    private static void startProcess(int processId) throws ServiceException {
        printMessage("\nstartProcess...");
        
        StartProcessInput payload = StartProcessInput.builder()
                .processId(processId)
                .flowExecutionData(FlowExecutionData.builder().actionToExecute("Cotação").build())
                .businessData("{\"root\": {\"destino\":\"Rondon\",\"partida\":\"2021-06-25\",\"retorno\":\"2021-06-28\",\"motivo\":\"Visita a cliente\"}}")
                .build();
        
        StartProcessOutput output = workflowClient.startProcess(payload);

        printMessage("Process Instance Id: " + output.getProcessInstanceID());
    }
    
    private static NewAttachmentOutput newAttachment() throws ServiceException {
        printMessage("\nnewAttachment...");
        
        NewAttachmentInput payload = NewAttachmentInput.builder()
                .name("foto_3x4.jpg")
                .size(362990)
                .build();

        NewAttachmentOutput output = workflowClient.newAttachment(payload);

        printMessage("Id: " + output.getAttachment().getId());
        printMessage("uploadUrl: " + output.getUploadUrl());
        
        return output;
    }

    private static void uploadFile(String uploadUrl) throws IOException {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPut httpPut = new HttpPut(uploadUrl);
            
            httpPut.setHeader("Content-type", "text/plain");
            httpPut.setEntity(new StringEntity("My text file"));
            
            httpclient.execute(httpPut);
        }
    }
    
    private static void commitAttachment(String attachmentId) throws ServiceException {
        printMessage("\ncommitAttachment...");
        
        workflowClient.commitAttachment(attachmentId);
    }

    private static void linkAttachments(String attachmentId, int processInstanceId) throws ServiceException {
        printMessage("\nlinkAttachments...");
        
        LinkAttachmentsInput payload = LinkAttachmentsInput.builder()
                .ids(Arrays.asList(attachmentId))
                .processInstance(processInstanceId)
                .build();

        workflowClient.linkAttachments(payload);
    }

    private static void getProcessesList() throws ServiceException {
        printMessage("\ngetProcessesList...");
        
        GetProcessesListInput payload = GetProcessesListInput.builder()
                .serviceAction(ServiceType.AllProcesses)
                .onlyActiveProcesses(false)
                .processFilterType(ProcessFilterType.All)
                .build();

        GetProcessesListOutput processesList = workflowClient.getProcessesList(payload);

        printMessage("Total: " + processesList.getProcesses().size());
        processesList.getProcesses().forEach(process -> printMessage(String.format("Id: %s | Nome: %s", process.getProcessId(), process.getProcessName())));
    }

    private static void getRankingProcesses() throws ServiceException {
        printMessage("\ngetRankingProcesses...");
        GetRankingProcessesInput payload = GetRankingProcessesInput.builder()
                .start(Instant.parse("2020-01-01T00:00:00.00Z"))
                .limit(5)
                .build();

        GetRankingProcessesOutput processesList = workflowClient.getRankingProcesses(payload);

        printMessage("Total: " + processesList.getProcesses().size());
        processesList.getProcesses().forEach(process -> printMessage(String.format("Id: %s | Nome: %s", process.getProcessId(), process.getProcessName())));
    }

    private static void findProcess(int processId) throws ServiceException {
        printMessage("\nfindProcess...");

        FindProcessOutput process = workflowClient.findProcess(processId);

        printMessage(String.format("Id: %s | Nome: %s", process.getProcess().getProcessId(), process.getProcess().getProcessName()));
    }

    private static void getProcessInstance(int processInstanceId) throws ServiceException {
        printMessage("\ngetProcessInstance...");

        GetProcessInstanceOutput process = workflowClient.getProcessInstance(processInstanceId);

        if (Objects.nonNull(process.getProcessInstance())) {
            printMessage(String.format("Id: %s | Nome: %s", process.getProcessInstance().getId(), process.getProcessInstance().getDescription()));
        } else {
            printMessage(String.format("Não encontrou instância com o id %s.", processInstanceId));
        }
    }

    private static void getRequestsResume(int processId) throws ServiceException {
        printMessage("\ngetRequestsResume...");
        
        GetRequestsResumeInput payload = GetRequestsResumeInput.builder()
                .filterProcess(Arrays.asList(processId))
                .orders(Arrays.asList(new KeyValueRecord("processInstanceId", OrderDirection.DESC.toString())))
                .build();

        GetRequestsResumeOutput output = workflowClient.getRequestsResume(payload);

        printMessage("Total: " + output.getTotal());
        output.getRequestsResume().forEach(request -> 
            printMessage(String.format("Id: %s | Status: %s", request.getProcessInstanceId(), request.getStatus())));
    }

    private static void getRequestHistoryTimeline(int processInstanceId) throws ServiceException {
        printMessage("\ngetRequestHistoryTimeline...");
        
        GetRequestHistoryTimelineOutput output = workflowClient.getRequestHistoryTimeline(processInstanceId);

        printMessage("Nome do processo: " + output.getProcessName());
        printMessage("Timeline:");
        output.getTimeline().forEach(entry -> printMessage(String.format("%s: %s", entry.getHistoryDate(), entry.getActionName())));
    }
    
    private static void getThirdPartyRequestByStatus() throws ServiceException {
        printMessage("\ngetThirdPartyRequestByStatus...");
        
        GetThirdPartyRequestByStatusInput payload = GetThirdPartyRequestByStatusInput.builder()
                .processKey("1")
                .status(PendencyType.Pending)
                .build();

        GetThirdPartyRequestByStatusOutput output = workflowClient.getThirdPartyRequestByStatus(payload);

        printMessage("Total: " + output.getRequests().size());
        output.getRequests().forEach(request -> printMessage(String.format("Third party id: %s", request.getThirdpartyId())));
    }
    
    private static void getSubjects() throws ServiceException {
        printMessage("\ngetSubjects...");

        GetSubjectsInput payload = GetSubjectsInput.builder()
                .type(SubjectKind.User)
                .build();

        GetSubjectsOutput output = workflowClient.getSubjects(payload);

        printMessage("Total: " + output.getTotalElements());
        output.getSubjects().forEach(subject -> printMessage(String.format("Code: %s | Nome: %s", subject.getUserCode(), subject.getName())));
    }
    
    private static void getNextSubject(int instanceId) throws ServiceException {
        printMessage("\ngetNextSubject...");
        
        ServiceFlowToken serviceFlowToken = ServiceFlowToken.builder()
                .processInstanceID(instanceId)
                .step(1)
                .activityId(2)
                .build();
        
        GetNextSubjectInput payload = GetNextSubjectInput.builder()
                .serviceFlowToken(serviceFlowToken)
                .sequenceName("sequence")
                .build();

        GetNextSubjectOutput output = workflowClient.getNextSubject(payload);

        printMessage("Total: " + output.getSubjects().size());
        output.getSubjects().forEach(subject -> printMessage(String.format("Code: %s | Nome: %s", subject.getUserCode(), subject.getName())));
    }
    
    private static void getNextSubjectFromInitialTask(int processId) throws ServiceException {
        printMessage("\ngetNextSubjectFromInitialTask...");
        
        GetNextSubjectFromInitialTaskInput payload = GetNextSubjectFromInitialTaskInput.builder()
                .processId(processId)
                .processVersion(1)
                .sequenceName("sequence")
                .build();

        GetNextSubjectFromInitialTaskOutput output = workflowClient.getNextSubjectFromInitialTask(payload);

        printMessage("Total: " + output.getSubjects().size());
        output.getSubjects().forEach(subject -> printMessage(String.format("Code: %s | Nome: %s", subject.getUserCode(), subject.getName())));
    }
    
    private static void searchTasks(String... processId) throws ServiceException {
        printMessage("\nsearchTasks...");

        Order order = Order.builder()
                .field(OrderField.EXPIRATION_DATE)
                .direction(OrderDirection.DESC)
                .build();
        
        SearchTasksFilter filter = SearchTasksFilter.builder()
                .processes(Arrays.asList(processId))
                .build();
        
        SearchTasksInput payload = SearchTasksInput.builder()
                .orders(Arrays.asList(order))
                .filter(filter)
                .build();

        SearchTasksOutput output = workflowClient.searchTasks(payload);

        printMessage("Total: " + output.getTotal());
        output.getTasks().forEach(task -> printMessage(String.format("Id: %s | Atividade: %s", task.getActivityId(), task.getActivity())));
    }

    private static void getMyPendencies() throws ServiceException {
        printMessage("\ngetMyPendencies...");
        
        PendencyRequestParameters pendencyRequestParameters = PendencyRequestParameters.builder()
                .type(PendencyType.Pending)
                .processFilterType(ProcessFilterType.All)
                .build();
        
        GetMyPendenciesInput payload = GetMyPendenciesInput.builder()
                .pendencyRequestParameters(pendencyRequestParameters)
                .build();

        GetMyPendenciesOutput output = workflowClient.getMyPendencies(payload);

        printMessage("Total: " + output.getTotal());
        output.getPendencies().forEach(pendency -> 
            printMessage(String.format("Descrição: %s | Expiração: %s", pendency.getDescription(), pendency.getExpirationDate())));
    }

    private static void getPendencyProcessActions(int instanceId) throws ServiceException {
        printMessage("\ngetPendencyProcessActions...");
        
        ServiceFlowToken serviceFlowToken = ServiceFlowToken.builder()
                .processInstanceID(instanceId)
                .step(1)
                .activityId(2)
                .build();
        
        GetPendencyProcessActionsInput payload = GetPendencyProcessActionsInput.builder()
                .serviceFlowToken(serviceFlowToken)
                .build();

        GetPendencyProcessActionsOutput output = workflowClient.getPendencyProcessActions(payload);

        printMessage("Total: " + output.getPendencyProcessAction().size());
        output.getPendencyProcessAction().forEach(action -> printMessage(String.format("Ação: %s", action.getName())));
    }

    private static void changePendencyUser(int processInstanceId) throws ServiceException {
        printMessage("\nchangePendencyUser...");
        
        ServiceFlowToken serviceFlowToken = ServiceFlowToken.builder()
                .processInstanceID(processInstanceId)
                .step(1)
                .activityId(2)
                .build();
        
        ServiceSubject subject = ServiceSubject.builder()
                .subjectKind(SubjectKind.User)
                .userCode(1)
                .name("Exemplo")
                .build();
        
        ChangePendencyUserInput payload = ChangePendencyUserInput.builder()
                .serviceFlowTokens(Arrays.asList(serviceFlowToken))
                .subject(subject)
                .build();

        workflowClient.changePendencyUser(payload);
    }
    
    private static void responsePendency(int processInstanceId) throws ServiceException {
        printMessage("\nresponsePendency...");
        
        ServiceFlowToken serviceFlowToken = ServiceFlowToken.builder()
                .processInstanceID(processInstanceId)
                .step(1)
                .activityId(2)
                .build();
        
        ResponseData responseData = ResponseData.builder()
                .businessData("{ \"aprovado\": true }")
                .flowExecutionData(FlowExecutionData.builder().actionToExecute("Cotação").build())
                .build();
        
        ResponsePendencyInput payload = ResponsePendencyInput.builder()
                .serviceFlowToken(serviceFlowToken)
                .responseData(responseData)
                .build();

        workflowClient.responsePendency(payload);
    }
    
    private static void batchPendenciesResponse(int processInstanceId) throws ServiceException {
        printMessage("\nbatchPendenciesResponse...");
        
        FlowToken flowToken = FlowToken.builder()
                .processInstanceId(processInstanceId)
                .step(1)
                .activityId(2)
                .build();
        
        BatchPendenciesResponseInput payload = BatchPendenciesResponseInput.builder()
                .flowTokens(Arrays.asList(flowToken))
                .authorization(accessToken)
                .build();

        workflowClient.batchPendenciesResponse(payload);
    }

    private static void cancelProcessInstance(int processInstanceId) throws ServiceException {
        printMessage("\ncancelProcessInstance...");
        
        CancelProcessInstanceInput payload = CancelProcessInstanceInput.builder()
                .ids(Arrays.asList(processInstanceId))
                .reason("Voo cancelado")
                .build();
        
        workflowClient.cancelProcessInstance(payload);
    }
    
    private static String authenticate() throws ServiceException {
        printMessage("Login...");
        
        // adicione estas variáveis de ambiente com seu usuário e senha ou substitua seus valores aqui
        final String username = System.getenv("SENIOR_USERNAME");
        final String password = System.getenv("PASS");

        AuthenticationClient client = new AuthenticationClient(Environment.HOMOLOG);
        LoginInput loginInput = LoginInput.builder()
                .username(username)
                .password(password)
                .build();

        LoginOutput output = client.login(loginInput);
        return output.getJsonToken().getAccessToken();
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }
}

