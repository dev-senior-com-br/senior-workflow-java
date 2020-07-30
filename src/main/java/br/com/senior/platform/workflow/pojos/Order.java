package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Ordenação
 */
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    /**
     * Campo a ser ordenado
     */
    public OrderField field;
    /**
     * Direção da ordenação
     */
    public OrderDirection direction;
}
