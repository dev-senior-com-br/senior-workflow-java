package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Objeto de entrada da action linkAttachments.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkAttachmentsInput {

    /**
     * Identificadores de anexos
     */
    @NonNull
    private List<String> ids;
    /**
     * Identificador da instância de processo ao qual o arquivo pertence
     */
    @NonNull
    private Integer processInstance;

}
