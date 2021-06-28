package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Registro Genérico para Chave Valor
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class KeyValueRecord {

    /**
     * Nome da Chave
     */
    @NonNull
    private String key;
    /**
     * Valor
     */
    @NonNull
    private String value;

}
