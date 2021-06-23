package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Filtro
 */
@NoArgsConstructor
@AllArgsConstructor
public class Filter {
    
    /**
     * Campo a ser filtrado
     */
    public FilterType type;
    /**
     * Valor como string
     */
    public Object stringValue;
    /**
     * Valor como data
     */
    public Date dateValue;
    /**
     * Valor do filtro por campo
     */
    public FilterField field;

}
