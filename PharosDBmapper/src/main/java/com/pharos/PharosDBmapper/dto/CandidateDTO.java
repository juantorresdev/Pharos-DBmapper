package com.pharos.PharosDBmapper.dto;

import com.pharos.PharosDBmapper.entities.Gender;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CandidateDTO {

    private Integer id;
    private String pharosId;
    private String name;
    private String lastname;
    private Date birthdate;
    private String email;
    private String phone;
    private String status;

}
