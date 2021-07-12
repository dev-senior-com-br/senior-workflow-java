package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de entrada da query getMyPendencies.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetMyPendenciesInput {

    /**
     * Parâmetros de filtro para a consulta
     */
    private PendencyRequestParameters pendencyRequestParameters;

}
