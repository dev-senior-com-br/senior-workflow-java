package br.com.senior.platform.workflow.pojos;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representação de um anexo no BlobService
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceAttachment {
    /**
     * Identificador do anexo
     */
    @NonNull
    private String id;
    /**
     * Nome do arquivo anexado
     */
    @NonNull
    private String name;
    /**
     * Tamanho do arquivo anexado
     */
    @NonNull
    private Integer size;
    /**
     * Data do envio
     */
    @NonNull
    private Instant uploadDate;
    /**
     * Responsável pelo anexo
     */
    @NonNull
    private String addedBy;
}
