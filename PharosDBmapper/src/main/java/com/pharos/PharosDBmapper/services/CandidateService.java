package com.pharos.PharosDBmapper.services;

import java.util.List;

import com.pharos.PharosDBmapper.wrappers.request.CandidateRequest;
import com.pharos.PharosDBmapper.wrappers.response.CandidateResponse;

public interface CandidateService {

    public CandidateResponse createCandidate(CandidateRequest candidateRequest) throws Exception;
    public CandidateResponse getCandidate(String pharosId) throws Exception;
    public List<CandidateResponse> getCandidateList(CandidateRequest candidateRequest) throws Exception;
    public CandidateResponse updateCandidate(CandidateRequest candidateRequest) throws Exception;
    public CandidateResponse deleteCandidate(CandidateRequest candidateRequest) throws Exception;

}
