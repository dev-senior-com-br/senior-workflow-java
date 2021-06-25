package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetSubjectsInput {
    
    /**
     * Página a ser consultada
     */
    public Long page;
    /**
     * Quantidade de itens na página
     */
    public Long pageSize;
    /**
     * filtro pelo nome
     */
    public String nameFilter;
    /**
     * Filtro por tipo
     */
    public SubjectKind type;
    /**
     * Incluir usuários removidos
     */
    public Boolean includeRemoved = false;

}
