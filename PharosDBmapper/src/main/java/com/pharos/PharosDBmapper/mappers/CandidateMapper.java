package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.CandidateDTO;
import com.pharos.PharosDBmapper.entities.Candidate;
import com.pharos.PharosDBmapper.wrappers.request.CandidateRequest;
import com.pharos.PharosDBmapper.wrappers.response.CandidateResponse;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateMapper {

    private final ModelMapper modelMapper;

    public CandidateDTO candidateToDto(Candidate candidate){
        return modelMapper.map(candidate, CandidateDTO.class);
    }

    public Candidate candidateRequestToCandidate(CandidateRequest candidateRequest){
        return modelMapper.map(candidateRequest, Candidate.class);
    }

    public Candidate dtoToCandidate(CandidateDTO candidateDTO){
        return modelMapper.map(candidateDTO, Candidate.class);
    }

    public CandidateResponse candidateToResponse(Candidate candidate){
        return modelMapper.map(candidate, CandidateResponse.class);
    }

    public List<CandidateDTO> candidateListToDtoList(List<Candidate> candidateList){
        return candidateList.stream()
        .map(candidate -> modelMapper.map(candidate, CandidateDTO.class))
        .collect(Collectors.toList());
    }

    public List<CandidateResponse> candidateListToResponseList(List<Candidate> candidateList){
        return candidateList.stream()
        .map(candidate -> modelMapper.map(candidate, CandidateResponse.class))
        .collect(Collectors.toList());
    }
}
