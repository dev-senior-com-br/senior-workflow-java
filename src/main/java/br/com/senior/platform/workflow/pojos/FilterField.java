package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Filtro por campo
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilterField {

    /**
     * Nome do campo
     */
    private String name;
    /**
     * Operador de comparação
     */
    private Operators operator;
    /**
     * Valor
     */
    private String value;

}
