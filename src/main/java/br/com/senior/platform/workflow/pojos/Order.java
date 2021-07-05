package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Ordenação.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Order {
    /**
     * Campo a ser ordenado
     */
    @NonNull
    private OrderField field;
    /**
     * Direção da ordenação
     */
    @NonNull
    private OrderDirection direction;
}
