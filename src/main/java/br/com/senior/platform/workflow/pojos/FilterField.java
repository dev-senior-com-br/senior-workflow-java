package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Filtro por campo
 */
@NoArgsConstructor
@AllArgsConstructor
public class FilterField {
    
    /**
     * Nome do campo
     */
    public String name;
    /**
     * Operador de comparação
     */
    public Operators operator;
    /**
     * Valor
     */
    public String value;
    
}
