package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetSubjectsInput {

    /**
     * Página a ser consultada
     */
    private Integer page;
    /**
     * Quantidade de itens na página
     */
    private Integer pageSize;
    /**
     * filtro pelo nome
     */
    private String nameFilter;
    /**
     * Filtro por tipo
     */
    @NonNull
    private SubjectKind type;
    /**
     * Incluir usuários removidos
     */
    private Boolean includeRemoved;

}
