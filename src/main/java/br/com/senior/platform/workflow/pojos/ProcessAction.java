package br.com.senior.platform.workflow.pojos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ProcessAction {
    
    public String name;
    public String label;
    public Boolean finish;
    public Boolean connectsWithAutomaticGateway;
    public Boolean isAppUser;

}
