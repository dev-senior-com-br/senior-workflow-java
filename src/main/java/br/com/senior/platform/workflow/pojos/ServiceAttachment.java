package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Representação de um anexo no BlobService
 */
@NoArgsConstructor
@AllArgsConstructor
public class ServiceAttachment {
    /**
     * Identificador do anexo
     */
    public String id;
    /**
     * Nome do arquivo anexado
     */
    public String name;
    /**
     * Tamanho do arquivo anexado
     */
    public Long size;
    /**
     * Data do envio
     */
    public Date uploadDate;
    /**
     * Responsável pelo anexo
     */
    public String addedBy;
}
