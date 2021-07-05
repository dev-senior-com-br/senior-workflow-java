package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa diferentes tipos de usuário.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceSubject {

    /**
     * Código do usuário
     */
    @NonNull
    private Integer userCode;
    /**
     * Nome do usuário
     */
    @NonNull
    private String name;
    /**
     * Tipo do usuário
     */
    @NonNull
    private SubjectKind subjectKind;

}
