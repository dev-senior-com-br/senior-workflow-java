package br.com.senior.platform.workflow.pojos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class GetProcessesListInput {
    
    /**
     * Tipo de Ação que indica quais processos serão listados
     */
    public ServiceType serviceAction;
    /**
     * Filtro por tipo de processo
     */
    public ProcessFilterType processFilterType;
    /**
     * Tag para filtro
     */
    public String tagFilter;
    /**
     * Apenas retorna processos ativos
     */
    public Boolean onlyActiveProcesses = true;
    /**
     * A partir de qual data buscar eventos de serviços externos
     */
    public Date serviceEventStartDate;
 
    /** 
     * Construtor com todos os campos obrigatórios.
     */
    public GetProcessesListInput(ServiceType serviceAction) {
        this.serviceAction = serviceAction;
    }
}
