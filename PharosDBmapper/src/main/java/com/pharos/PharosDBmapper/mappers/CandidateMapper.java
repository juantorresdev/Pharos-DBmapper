package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.CandidateDTO;
import com.pharos.PharosDBmapper.entities.Candidate;
import com.pharos.PharosDBmapper.wrappers.request.CandidateRequest;

import lombok.RequiredArgsConstructor;

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
}
