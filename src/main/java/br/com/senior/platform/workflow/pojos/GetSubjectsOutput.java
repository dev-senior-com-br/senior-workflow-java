package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Objeto de retorno da query getSubjects.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetSubjectsOutput {

    /**
     * Lista de responsáveis
     */
    private List<ServiceSubject> subjects;
    /**
     * Total de itens
     */
    private Integer totalElements;
    /**
     * Total de páginas
     */
    private Integer totalPages;

}
