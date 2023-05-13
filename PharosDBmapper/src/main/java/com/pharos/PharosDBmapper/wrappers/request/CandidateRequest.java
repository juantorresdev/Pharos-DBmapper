package com.pharos.PharosDBmapper.wrappers.request;

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
public class CandidateRequest {
    private String pharosId;
    private String name;
    private String lastname;
    private Date birthdate;
    private String email;
    private String phone;
}
