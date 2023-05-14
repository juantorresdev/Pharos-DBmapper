package com.pharos.PharosDBmapper.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        BodyBuilder bodyBuilder;

        try {
            CandidateResponse candidateResponse = candidateService.getCandidate(candidateId);
            bodyBuilder = ResponseEntity.status(HttpStatus.OK);
        } catch (Exception e) {
            bodyBuilder = ResponseEntity.status(HttpStatus.NOT_FOUND);
        }
        return bodyBuilder.body(pharosDBMapperResponse);

    }

}
