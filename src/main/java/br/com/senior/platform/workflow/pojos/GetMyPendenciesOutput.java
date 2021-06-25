package br.com.senior.platform.workflow.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetMyPendenciesOutput {
    
    public List<Pendency> pendencies;
    public Long total;
    
    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public GetMyPendenciesOutput(java.util.List<Pendency> pendencies) {
        this.pendencies = pendencies;
    }

}
