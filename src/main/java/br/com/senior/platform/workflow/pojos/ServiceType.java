package br.com.senior.platform.workflow.pojos;

/**
 * Representa qual tipo de retorno o serviço terá
 */
public enum ServiceType {
    /**
     * Processos que o usuário pode abrir solicitação
     */
    UserGrantedProcesses,
    /**
     * Processos que o usuário pode coordernar
     */
    UserGrantedCordinateProcesses,
    /**
     * Processos que o usuários pode editar
     */
    AllProcesses,
    /**
     * Processos que o usuário pode editar ou visualizar, levando na propriedade
     */
    UserGrantedOrEditProcesses
}
