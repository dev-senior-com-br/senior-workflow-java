package br.com.senior.platform.workflow;

import br.com.senior.core.authentication.AuthenticationClient;
import br.com.senior.core.authentication.pojos.LoginInput;
import br.com.senior.core.authentication.pojos.LoginOutput;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.platform.workflow.pojos.CommitAttachmentInput;
import br.com.senior.platform.workflow.pojos.FlowExecutionData;
import br.com.senior.platform.workflow.pojos.LinkAttachmentsInput;
import br.com.senior.platform.workflow.pojos.NewAttachmentInput;
import br.com.senior.platform.workflow.pojos.NewAttachmentOutput;
import br.com.senior.platform.workflow.pojos.Order;
import br.com.senior.platform.workflow.pojos.OrderDirection;
import br.com.senior.platform.workflow.pojos.OrderField;
import br.com.senior.platform.workflow.pojos.Pagination;
import br.com.senior.platform.workflow.pojos.SearchTasksFilter;
import br.com.senior.platform.workflow.pojos.SearchTasksInput;
import br.com.senior.platform.workflow.pojos.SearchTasksOutput;
import br.com.senior.platform.workflow.pojos.ServiceAttachment;
import br.com.senior.platform.workflow.pojos.StartProcessInput;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class WorkflowIT {

    private static WorkflowClient client;
    private static Environment env;

    @BeforeClass
    public static void beforeClass() throws ServiceException {
        env = Environment.ARC;
        String token = login().getJsonToken().getAccess_token();
        client = new WorkflowClient(token, env);
    }

    protected static LoginOutput login() throws ServiceException {
        LoginInput input = new LoginInput(System.getenv("SENIOR_USERNAME"), System.getenv("PASS"));
        return new AuthenticationClient(env).login(input);
    }

    @Test
    public void testProcess() throws ServiceException {

        //variáveis de inicio de fluxo
        Long processId = 39l;
//        Long processInstanceId = 60l;
        String businessDataStart = "{\"root\": {\"destino\":\"a\",\"partida\":\"2020-08-01\",\"retorno\":\"2020-08-08\",\"motivo\":\"Visita a cliente\",\"cotacao\":null}}"; //dados da solicitação, estou criando uma sem campos preenchidos para simplificar
        String actionToExecuteStart = "Cotação";
        String nextSubject = "admin";

        //variáveis de resposta do fluxo
        Long step = Long.valueOf(System.getenv("STEP_TO_RESPONSE"));//Passo do fluxo, contador incremental da atividade no fluxo, cada vez que passa de uma atividade para outra incrementa o contador no fluxo, por causa de processos com múltiplas etapas pendentes é necessário informar qual etapa esta resposta está endereçada.
        Long activityId = Long.valueOf(System.getenv("ACTIVITY_ID_TO_RESPONSE")); //Identificador único da atividade dentro do fluxo, por causa de processos com múltiplas etapas pendentes é necessário informar qual etapa esta resposta está endereçada.
        String businessDataResponse = "{}"; //dados da resposta da solicitação, estou criando uma sem campos preenchidos para simplificar
        String actionToExecuteResponse = System.getenv("ACTION_TO_EXECUTE_RESPONSE");

        String title = "nova solicitação";
        StartProcessInput input = new StartProcessInput(null, processId, null, businessDataStart, new FlowExecutionData(actionToExecuteStart, nextSubject), null, title, null);
        Long processInstanceId = client.startProcess(input);
        assertNotNull(processInstanceId);

        //Quando listagem ficar pronta, adicionar aqui a listagem verificando que o processinstanceId foi encontrado e mercado como pendente

//        ResponsePendencyInput responsePendencyInput = new ResponsePendencyInput(new ServiceFlowToken(processInstanceId, step, activityId), new ResponseData(businessDataResponse, new FlowExecutionData(actionToExecuteResponse, null)), null, null);
//        client.responsePendency(responsePendencyInput);

        //o processInstanceId deve estar marcado como tratado
    }

    @Test
    public void testAttachment() throws ServiceException, IOException {
        String fileName = "file.txt";
        Long fileSize = 10l;

        NewAttachmentInput newAttachmentInput = new NewAttachmentInput(fileName, fileSize);
        NewAttachmentOutput newAttachmentOutput = client.newAttachment(newAttachmentInput);

        assertNotNull(newAttachmentOutput);
        assertNotNull(newAttachmentOutput.uploadUrl);

        ServiceAttachment newAttachment = newAttachmentOutput.attachment;
        assertNotNull(newAttachment);
        assertNotNull(newAttachment.id);
        assertEquals(fileName, newAttachment.name);
        assertEquals(fileSize, newAttachment.size);

        // Deve efetuar o upload do arquivo
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpPut put = new HttpPut(URI.create(newAttachmentOutput.uploadUrl));
        put.setHeader("Content-type", "text/plain");
        put.setEntity(new StringEntity("texto do arquivo"));

        ResponseHandler<Integer> responseHandler = response -> {
            int statusCode = response.getStatusLine().getStatusCode();
            assertEquals(200, statusCode);

            try {
                // Move o arquivo da área temporária para a permanente
                String id = newAttachmentOutput.attachment.id;
                client.commitAttachment(new CommitAttachmentInput(id));

                // Associa o anexo ao processo
                LinkAttachmentsInput linkAttachmentsInput = new LinkAttachmentsInput();
                linkAttachmentsInput.ids = List.of(id);
                linkAttachmentsInput.processInstance = Long.valueOf(System.getenv("PROCESS_ID"));
                client.linkAttachments(linkAttachmentsInput);
            } catch (ServiceException e) {
                fail(e.getMessage());
            }

            return statusCode;
        };

        int statusCode = httpclient.execute(put, responseHandler);
        assertEquals(200, statusCode);
    }

    @Test
    public void testTasks() throws ServiceException {
        SearchTasksFilter filter = new SearchTasksFilter();

        Pagination pagination = new Pagination();

        List<Order> orders = List.of(new Order(OrderField.START_DATE, OrderDirection.ASC));

        SearchTasksInput searchTasksInput = new SearchTasksInput(filter, pagination, orders);
        SearchTasksOutput searchTasksOutput = client.searchTasks(searchTasksInput);

        assertNotNull(searchTasksOutput);
        assertNotNull(searchTasksOutput.tasks);
    }
}