package br.com.senior.platform.workflow.pojos;

import java.time.Instant;
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
     * Identificador do processo
     */
    @NonNull
    private Integer processId;
    /**
     * Versão atual do processo
     */
    @NonNull
    private Integer currentVersion;
    /**
     * Versão publicada do processo
     */
    @NonNull
    private Integer publishedVersion;
    /**
     * Nome do processo
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
     * Nome do arquivo do processo
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
    private Instant creationDate;
    /**
     * Se o processo está ativo
     */
    private Boolean active;
    /**
     * Se o processo é integrado
     */
    private Boolean embedded;
    /**
     * Se o processo é simples
     */
    private Boolean simple;
    /**
     * Tag agrupadora de Processos
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
