package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.GenderDTO;
import com.pharos.PharosDBmapper.entities.Gender;
import org.springframework.stereotype.Component;

@Component
public class GenderMapper {

    public GenderDTO genderToDto(Gender gender){
        GenderDTO genderDTO = new GenderDTO();
        return genderDTO;
    }

    public Gender dtoToGender(GenderDTO genderDTO){
        Gender gender = new Gender();
        return gender;
    }
}