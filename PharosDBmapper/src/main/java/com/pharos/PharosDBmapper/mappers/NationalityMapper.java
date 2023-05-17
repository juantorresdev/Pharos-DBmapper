package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.NationalityDTO;
import com.pharos.PharosDBmapper.entities.Nationality;
import com.pharos.PharosDBmapper.wrappers.request.NationalityRequest;
import com.pharos.PharosDBmapper.wrappers.response.NationalityResponse;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NationalityMapper {

    private final ModelMapper modelMapper;

    public NationalityDTO nationalityToDto(Nationality nationality){
        return modelMapper.map(nationality, NationalityDTO.class);
    }

    public Nationality dtoToNationality(NationalityDTO nationalityDTO){
        return modelMapper.map(nationalityDTO, Nationality.class);
    }

    public Nationality nationalityRequestToNationality(NationalityRequest nationalityRequest){
        return modelMapper.map(nationalityRequest, Nationality.class);
    }

    public NationalityResponse nationalityToResponse(Nationality nationality){
        return modelMapper.map(nationality, NationalityResponse.class);
    }

    public List<NationalityResponse> nationalityListToResponseList(List<Nationality> nationalityList){
        return nationalityList.stream()
        .map(nationality -> modelMapper.map(nationality, NationalityResponse.class))
        .collect(Collectors.toList());
    }

    public List<NationalityDTO> nationalityListToDtoList(List<Nationality> nationalityList){
        return nationalityList.stream()
        .map(nationality -> modelMapper.map(nationality, NationalityDTO.class))
        .collect(Collectors.toList());
    }
}
