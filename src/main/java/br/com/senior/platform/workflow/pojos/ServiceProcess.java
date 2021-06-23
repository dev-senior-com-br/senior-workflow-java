package br.com.senior.platform.workflow.pojos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Representa um processo de workflow.
 */
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProcess {

    /**
     * Identificador do Processo
     */
    public Long processId;
    /**
     * Versão Atual do Processo
     */
    public Long currentVersion;
    /**
     * Versão Publicada do Processo
     */
    public Long publishedVersion;
    /**
     * Nome do Processo
     */
    public String processName;
    /**
     * Nome do processo assim como se encontra no banco de dados
     */
    public String processRawName;
    /**
     * Se o processo está modificado
     */
    public Boolean changed;
    /**
     * Nome do Arquivo do Processo
     */
    public String fileName;
    /**
     * Se o processo está publicado ou apenas salvo
     */
    public ProcessPublicationStatus status;
    /**
     * Descrição do processo
     */
    public String description;
    /**
     * Data de criação do processo
     */
    public Date creationDate;
    /**
     * Se o processo está ativo
     */
    public Boolean active;
    /**
     * Se o processo é embarcado
     */
    public Boolean embedded;
    /**
     * Se o processo é simples
     */
    public Boolean simple;
    /**
     * Tag agrupador de Processos
     */
    public String tag;
    /**
     * Indica o nível de acesso do usuário ao processo
     */
    public ProcessAccessLevel accessLevel;
    /**
     * Ícone do processo
     */
    public String icon;
    /**
     * Listagem dos tipos e quantidade de eventos de serviço externo
     */
    public List<ServiceEventQtyByType> serviceEventQtyByType;

    /**
     * Construtor que possibilita a inicialização de todos os campos obrigatórios.
     */
    public ServiceProcess(Long processId, Long currentVersion, Long publishedVersion, String processName, String processRawName, Boolean changed, String fileName, ProcessPublicationStatus status, String description, Date creationDate) {
        this.processId = processId;
        this.currentVersion = currentVersion;
        this.publishedVersion = publishedVersion;
        this.processName = processName;
        this.processRawName = processRawName;
        this.changed = changed;
        this.fileName = fileName;
        this.status = status;
        this.description = description;
        this.creationDate = creationDate;
    }
}
