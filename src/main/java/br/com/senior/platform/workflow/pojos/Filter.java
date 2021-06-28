package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Filtro
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Filter {

    /**
     * Campo a ser filtrado
     */
    @NonNull
    private FilterType type;
    /**
     * Valor como string
     */
    private Object stringValue;
    /**
     * Valor como data
     */
    private Date dateValue;
    /**
     * Valor do filtro por campo
     */
    private FilterField field;

}
