package br.com.senior.core.workflow;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.core.workflow.pojos.ResponsePendencyInput;
import br.com.senior.core.workflow.pojos.StartProcessInput;
import br.com.senior.core.workflow.pojos.StartProcessOutput;

public class WorkflowClient extends BaseClient {

    String token;

    public WorkflowClient(String token) {
        super("platform", "workflow");
        this.token = token;
    }

    public WorkflowClient(String token, Environment env) {
        super("platform", "workflow", env);
        this.token = token;
    }

    /**
     * Inicia um processo
     *
     * @param payload - Payload de entrada com os dados para inicio do processo
     * @return - ID da instância do processo iniciado
     * @throws ServiceException - Erro tratado do serviço
     */
    public Long startProcess(StartProcessInput payload) throws ServiceException {
        return execute(getActionsUrl("startProcess"), payload, token, StartProcessOutput.class).processInstanceID;
    }

    public void responsePendency(ResponsePendencyInput payload) throws ServiceException {
        execute(getActionsUrl("responsePendency"), payload, token, Object.class);
    }
}
