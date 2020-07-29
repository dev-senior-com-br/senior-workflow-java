package br.com.senior.platform.apps.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NewAttachmentOutput {
    /**
     * Anexo
     */
    public ServiceAttachment attachment;
    /**
     * URL para o anexo
     */
    public String uploadUrl;
}
