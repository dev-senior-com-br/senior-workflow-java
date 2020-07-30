package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NewAttachmentInput {

    /**
     * Nome do arquivo a ser anexado
     */
    public String name;
    /**
     * Tamanho do arquivo a ser anexado
     */
    public Long size;

    /**
     * Construtor para inicialização de todos os campos obrigatórios.
     */
    public NewAttachmentInput(String name) {
        this(name, null);
    }
}
