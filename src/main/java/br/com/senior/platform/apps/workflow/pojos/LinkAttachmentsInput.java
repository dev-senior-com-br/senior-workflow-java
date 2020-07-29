package br.com.senior.platform.apps.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class LinkAttachmentsInput {

    /**
     * Identificadores de anexo
     */
    public java.util.List<String> ids;
    /**
     * Identificador da instância de processo a qual o arquivo pertence.
     */
    public Long processInstance;

}
