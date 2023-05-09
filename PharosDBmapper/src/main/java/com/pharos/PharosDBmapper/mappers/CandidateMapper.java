package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.CandidateDTO;
import com.pharos.PharosDBmapper.entities.Candidate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateMapper {

    private final ModelMapper modelMapper;

    public CandidateDTO candidateToDto(Candidate candidate){
        CandidateDTO candidateDTO = modelMapper.map(candidate, Candidate.class);
        return candidateDTO;
    }

    public Candidate dtoToCandidate(CandidateDTO candidateDTO){
        Candidate candidate = modelMapper.map(candidateDTO, Candidate)
        return candidate;
    }
}
