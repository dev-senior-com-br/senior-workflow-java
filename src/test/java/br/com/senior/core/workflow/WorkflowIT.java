package br.com.senior.core.workflow;

import br.com.senior.core.authentication.AuthenticationClient;
import br.com.senior.core.authentication.pojos.LoginInput;
import br.com.senior.core.authentication.pojos.LoginOutput;
import br.com.senior.core.base.ServiceException;
import br.com.senior.core.workflow.pojos.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WorkflowIT {

    private static WorkflowClient client;

    @BeforeClass
    public static void beforeClass() throws ServiceException {
        String token = login().getJsonToken().getAccess_token();
        client = new WorkflowClient(token);
    }

    @Test
    public void testProcess() throws ServiceException {
        //variáveis de inicio de fluxo
        Long processId = Long.valueOf(System.getenv("PROCESS_ID"));
        String businessDataStart = "{}"; //dados da solicitação, estou criando uma sem campos preenchidos para simplificar
        String actionToExecuteStart = System.getenv("ACTION_START_PROCESS"); //Ação a ser escolhida na abertura da tarefa
        String nextSubject = System.getenv("SUBJECT_FIRST_PENDENCY"); //Usuário que vai receber a pendência, ou seja, próximo usuário do fluxo

        //variáveis de resposta do fluxo
        Long step = Long.valueOf(System.getenv("STEP_TO_RESPONSE"));//Passo do fluxo, contador incremental da atividade no fluxo, cada vez que passa de uma atividade para outra incrementa o contador no fluxo, por causa de processos com múltiplas etapas pendentes é necessário informar qual etapa esta resposta está endereçada.
        Long activityId = Long.valueOf(System.getenv("ACTIVITY_ID_TO_RESPONSE")); //Identificador único da atividade dentro do fluxo, por causa de processos com múltiplas etapas pendentes é necessário informar qual etapa esta resposta está endereçada.
        String businessDataResponse = "{}"; //dados da resposta da solicitação, estou criando uma sem campos preenchidos para simplificar
        String actionToExecuteResponse = System.getenv("ACTION_RESPONSE");

        StartProcessInput input = new StartProcessInput(null, processId, null, businessDataStart, new FlowExecutionData(actionToExecuteStart, nextSubject), null, "nova solicitação", null);
        Long processInstanceId = client.startProcess(input);
        Assert.assertNotNull(processInstanceId);
        System.out.println(processInstanceId);

        //Quando listagem ficar pronta, adicionar aqui a listagem verificando que o processinstanceId foi encontrado e mercado como pendente

        ResponsePendencyInput responsePendencyInput = new ResponsePendencyInput(new ServiceFlowToken(processInstanceId, step, activityId), new ResponseData(businessDataResponse, new FlowExecutionData(actionToExecuteResponse, null)), null, null);
        client.responsePendency(responsePendencyInput);

        //o processInstanceId deve estar marcado como tratado
    }

    protected static LoginOutput login() throws ServiceException {
        LoginInput input = new LoginInput(System.getenv("SENIOR_USERNAME"), System.getenv("PASSWORD"));
        return new AuthenticationClient().login(input);
    }
}