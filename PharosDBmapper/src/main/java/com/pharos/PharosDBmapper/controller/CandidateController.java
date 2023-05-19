package com.pharos.PharosDBmapper.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pharos.PharosDBmapper.services.CandidateService;
import com.pharos.PharosDBmapper.wrappers.request.CandidateRequest;
import com.pharos.PharosDBmapper.wrappers.response.CandidateResponse;
import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;

@RestController
@RequestMapping("/api/v1/candidate")
@RequiredArgsConstructor
@Slf4j
public class CandidateController {

    private final CandidateService candidateService;

    @PostMapping("/createCandidate")
    public ResponseEntity<PharosDBMapperResponse> createCandidate(@RequestBody CandidateRequest candidateRequest){

        log.info("Accessed to /api/v1/candidate/createCandidate endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try{
            CandidateResponse candidateResponse = new CandidateResponse();
            pharosDBMapperResponse.setData(candidateResponse);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @GetMapping("/getCandidate")
    public ResponseEntity<PharosDBMapperResponse> getCandidate(@RequestParam("candidateId") String candidateId) {

        log.info("Accessed to /api/v1/candidate/getCandidate endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            CandidateResponse candidateResponse = candidateService.getCandidate(candidateId);
            pharosDBMapperResponse.setData(candidateResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @PostMapping("/getCandidateList")
    public ResponseEntity<PharosDBMapperResponse> getCandidateList(@RequestBody CandidateRequest candidateRequest) {
        
        log.info("Accessed to /api/v1/candidate/getCandidateList endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            List<CandidateResponse> candidatesResponse = candidateService.getCandidateList(candidateRequest);
            pharosDBMapperResponse.setData(candidatesResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }

    @PutMapping("updateCandidate")
    public ResponseEntity<PharosDBMapperResponse> updateCandidate(@RequestBody CandidateRequest candidateRequest){

        log.info("Accessed to /api/v1/candidate/updateCandidate endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();
        
        try {
            CandidateResponse candidateResponse = candidateService.updateCandidate(candidateRequest);
            pharosDBMapperResponse.setData(candidateResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }
    

}
