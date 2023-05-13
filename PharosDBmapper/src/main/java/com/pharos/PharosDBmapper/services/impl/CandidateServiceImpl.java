package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.entities.Candidate;
import com.pharos.PharosDBmapper.mappers.CandidateMapper;
import com.pharos.PharosDBmapper.repository.CandidateRepository;
import com.pharos.PharosDBmapper.services.CandidateService;
import com.pharos.PharosDBmapper.wrappers.request.CandidateRequest;
import com.pharos.PharosDBmapper.wrappers.response.CandidateResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CandidateServiceImpl implements CandidateService{

    private final CandidateRepository candidateRepository;
    private final CandidateMapper candidateMapper;

    @Override
    public CandidateResponse createCandidate(CandidateRequest candidateRequest) throws Exception {
        log.info("Accessed to createCandidate service");

        Candidate candidate = new Candidate();

        return null;
    }

    @Override
    public CandidateResponse getCandidate(String pharosId) throws Exception {
        log.info("Accessed to getCandidate service");
        return null;
    }

    @Override
    public List<CandidateResponse> getCandidateList(CandidateRequest candidateRequest) throws Exception {
        log.info("Accessed to getCandidateList service");
        return null;
    }

    @Override
    public CandidateResponse updateCandidate(CandidateRequest candidateRequest) throws Exception {
        log.info("Accessed to updateCandidate service");
        return null;
        
    }

    @Override
    public CandidateResponse deleteCandidate(CandidateRequest candidateRequest) throws Exception {
        log.info("Accessed to deleteCandidate service");
        return null;
        
    }

}
