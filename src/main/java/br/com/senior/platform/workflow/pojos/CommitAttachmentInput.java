package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da action commitAttachment.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class CommitAttachmentInput {

    /**
     * Identificador do anexo
     */
    @NonNull
    private String id;
}
