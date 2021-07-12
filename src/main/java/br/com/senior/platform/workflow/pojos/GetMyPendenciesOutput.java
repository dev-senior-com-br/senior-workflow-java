package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da query getMyPendencies.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetMyPendenciesOutput {

    /**
     * Lista de pendências
     */
    private List<Pendency> pendencies;
    /**
     * Total de registros
     */
    private Integer total;

}
