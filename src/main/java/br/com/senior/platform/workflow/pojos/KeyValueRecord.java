package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Registro genérico para chave valor.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class KeyValueRecord {

    /**
     * Nome da chave
     */
    @NonNull
    private String key;
    /**
     * Valor da chave
     */
    @NonNull
    private String value;

}
