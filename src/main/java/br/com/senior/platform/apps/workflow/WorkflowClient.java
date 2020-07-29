package br.com.senior.platform.apps.workflow;

import br.com.senior.core.base.BaseClient;
import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.platform.apps.workflow.pojos.CommitAttachmentInput;
import br.com.senior.platform.apps.workflow.pojos.LinkAttachmentsInput;
import br.com.senior.platform.apps.workflow.pojos.NewAttachmentInput;
import br.com.senior.platform.apps.workflow.pojos.NewAttachmentOutput;
import br.com.senior.platform.apps.workflow.pojos.ResponsePendencyInput;
import br.com.senior.platform.apps.workflow.pojos.StartProcessInput;
import br.com.senior.platform.apps.workflow.pojos.StartProcessOutput;

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
     * Inicia um processo
     *
     * @param payload - Payload de entrada com os dados para inicio do processo
     * @return - ID da instância do processo iniciado
     * @throws ServiceException - Erro tratado do serviço
     */
    public Long startProcess(StartProcessInput payload) throws ServiceException {
        return execute(getActionsUrl("startProcess"), payload, token, StartProcessOutput.class).processInstanceID;
    }

    /**
     * Responde uma pendência
     *
     * @param payload - Payload de entrada com os dados para responder uma pendência
     * @throws ServiceException - Erro tratado do serviço
     */
    public void responsePendency(ResponsePendencyInput payload) throws ServiceException {
        execute(getActionsUrl("responsePendency"), payload, token, Object.class);
    }

    /**
     * Cria uma nova representação de um anexo do Workflow
     *
     * @param payload - Payload de entrada com os dados para criar uma nova representação de anexo
     * @return - Payload de saída com os dados do anexo
     * @throws ServiceException - Erro tratado do serviço
     */
    public NewAttachmentOutput newAttachment(NewAttachmentInput payload) throws ServiceException {
        return execute(getActionsUrl("newAttachment"), payload, token, NewAttachmentOutput.class);
    }

    /**
     * Faz commit de um anexo movendo ele da área temporária para permanente
     *
     * @param payload - Payload de entrada com o identificador do anexo
     * @throws ServiceException - Erro tratado do serviço
     */
    public void commitAttachment(CommitAttachmentInput payload) throws ServiceException {
        execute(getActionsUrl("commitAttachment"), payload, token, Object.class);
    }

    /**
     * Liga determinados anexos a uma instância de processo
     *
     * @param payload - Payload de entrada com os identificadores dos anexos e o identificador do processo
     * @throws ServiceException - Erro tratado do serviço
     */
    public void linkAttachments(LinkAttachmentsInput payload) throws ServiceException {
        execute(getActionsUrl("linkAttachments"), payload, token, Object.class);
    }
}
