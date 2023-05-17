package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.GenderDTO;
import com.pharos.PharosDBmapper.entities.Gender;
import com.pharos.PharosDBmapper.wrappers.response.GenderResponse;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GenderMapper {

    private final ModelMapper modelMapper;

    public GenderDTO genderToDto(Gender gender){
        return modelMapper.map(gender, GenderDTO.class);
    }

    public Gender dtoToGender(GenderDTO genderDTO){
        return modelMapper.map(genderDTO, Gender.class);
    }

    public Gender dtotoGender(GenderDTO genderDTO){
        return modelMapper.map(genderDTO, Gender.class);
    }

    public GenderResponse genderToResponse(Gender gender){
        return modelMapper.map(gender, GenderResponse.class);
    }

    public List<GenderDTO> genderListToDtoList(List<Gender> genderList){
        return genderList.stream()
        .map(gender -> modelMapper.map(gender, GenderDTO.class))
        .collect(Collectors.toList());
    }

    public List<GenderResponse> genderListToResponseList(List<Gender> genderList){
        return genderList.stream()
        .map(gender -> modelMapper.map(gender, GenderResponse.class))
        .collect(Collectors.toList());
    }
}
