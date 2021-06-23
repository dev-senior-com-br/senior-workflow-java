package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Registro Genérico para Chave Valor
 */
@NoArgsConstructor
@AllArgsConstructor
public class KeyValueRecord {
    
    /**
     * Nome da Chave
     */
    public String key;
    /**
     * Valor
     */
    public String value;
   
}
