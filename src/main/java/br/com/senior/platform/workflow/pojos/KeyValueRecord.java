package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;

/**
 * Registro Genérico para Chave Valor
 */
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
