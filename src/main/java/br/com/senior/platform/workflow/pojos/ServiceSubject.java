package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Representa um usuário ou grupo.
 */
@NoArgsConstructor
@AllArgsConstructor
public class ServiceSubject {
    
    public Long userCode;
    public String name;
    public SubjectKind subjectKind;

}
