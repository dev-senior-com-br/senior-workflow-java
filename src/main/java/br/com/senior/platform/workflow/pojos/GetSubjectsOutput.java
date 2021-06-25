package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetSubjectsOutput {
    
    /**
     * Lista de responsáveis
     */
    public List<ServiceSubject> subjects;
    /**
     * Total de Itens
     */
    public Long totalElements;
    /**
     * Total de Páginas
     */
    public Long totalPages;
    
    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public GetSubjectsOutput(List<ServiceSubject> subjects) {
        this.subjects = subjects;
    }

}
