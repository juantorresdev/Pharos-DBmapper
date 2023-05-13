package com.pharos.PharosDBmapper.wrappers.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CandidateResponse {
    private String pharosId;
    private String name;
    private String lastname;
    private Date birthdate;
    private String email;
    private String phone;
    private String status;
    private String enable;
    private String activationcode;
    
}
