package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.NationalityDTO;
import com.pharos.PharosDBmapper.entities.Nationality;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NationalityMapper {

    private final ModelMapper modelMapper;

    public NationalityDTO nationalityToDto(Nationality nationality){
        NationalityDTO nationalityDTO = new NationalityDTO();
        return nationalityDTO;
    }

    public Nationality dtoToNationality(NationalityDTO nationalityDTO){
        Nationality nationality = new Nationality();
        return nationality;
    }
}
