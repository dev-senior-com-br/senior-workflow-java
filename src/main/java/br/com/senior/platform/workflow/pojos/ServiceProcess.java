package br.com.senior.platform.workflow.pojos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa um processo de workflow.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProcess {

    /**
     * Identificador do Processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão Atual do Processo
     */
    @NonNull
    private Integer currentVersion;
    /**
     * Versão Publicada do Processo
     */
    @NonNull
    private Integer publishedVersion;
    /**
     * Nome do Processo
     */
    @NonNull
    private String processName;
    /**
     * Nome do processo assim como se encontra no banco de dados
     */
    @NonNull
    private String processRawName;
    /**
     * Se o processo está modificado
     */
    @NonNull
    private Boolean changed;
    /**
     * Nome do Arquivo do Processo
     */
    @NonNull
    private String fileName;
    /**
     * Se o processo está publicado ou apenas salvo
     */
    @NonNull
    private ProcessPublicationStatus status;
    /**
     * Descrição do processo
     */
    @NonNull
    private String description;
    /**
     * Data de criação do processo
     */
    @NonNull
    private Date creationDate;
    /**
     * Se o processo está ativo
     */
    private Boolean active;
    /**
     * Se o processo é embarcado
     */
    private Boolean embedded;
    /**
     * Se o processo é simples
     */
    private Boolean simple;
    /**
     * Tag agrupador de Processos
     */
    private String tag;
    /**
     * Indica o nível de acesso do usuário ao processo
     */
    private ProcessAccessLevel accessLevel;
    /**
     * Ícone do processo
     */
    private String icon;
    /**
     * Listagem dos tipos e quantidade de eventos de serviço externo
     */
    private List<ServiceEventQtyByType> serviceEventQtyByType;

}
