package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da action newAttachment.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewAttachmentInput {

    /**
     * Nome do arquivo a ser anexado
     */
    @NonNull
    private String name;
    /**
     * Tamanho do arquivo a ser anexado
     */
    private Integer size;

}
