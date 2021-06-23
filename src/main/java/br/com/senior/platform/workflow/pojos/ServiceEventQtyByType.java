package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Quantidade de eventos de serviços externos por tipos
 */
@NoArgsConstructor
@AllArgsConstructor
public class ServiceEventQtyByType {
    
    /**
     * Tipo do evento
     */
    public IntegrationStatus type;
    /**
     * Quantidade de eventos
     */
    public Long quantity;

}
