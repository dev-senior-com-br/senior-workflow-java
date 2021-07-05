package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Quantidade de eventos de serviços externos por tipos.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceEventQtyByType {

    /**
     * Tipo do evento
     */
    @NonNull
    private IntegrationStatus type;
    /**
     * Quantidade de eventos
     */
    @NonNull
    private Integer quantity;

}
