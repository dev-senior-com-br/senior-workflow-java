package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da action newAttachment.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewAttachmentOutput {
    /**
     * Anexo
     */
    private ServiceAttachment attachment;
    /**
     * URL na qual o upload do arquivo poderá ser realizado
     */
    private String uploadUrl;
}
