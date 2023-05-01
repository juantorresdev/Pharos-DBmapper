package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.CandidateDTO;
import com.pharos.PharosDBmapper.entities.Candidate;
import org.springframework.stereotype.Component;

@Component
public class CandidateMapper {

    public CandidateDTO candidateToDto(Candidate candidate){
        CandidateDTO candidateDTO = new CandidateDTO();
        return candidateDTO;
    }

    public Candidate dtoToCandidate(CandidateDTO candidateDTO){
        Candidate candidate = new Candidate();
        return candidate;
    }
}
