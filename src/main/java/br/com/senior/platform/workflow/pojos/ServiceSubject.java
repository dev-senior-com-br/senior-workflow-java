package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

/**
 * Representa um usuário ou grupo.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceSubject {

    @NonNull
    private Integer userCode;
    @NonNull
    private String name;
    @NonNull
    private SubjectKind subjectKind;

}
