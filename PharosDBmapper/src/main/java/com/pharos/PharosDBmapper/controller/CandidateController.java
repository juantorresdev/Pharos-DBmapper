package com.pharos.PharosDBmapper.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/v1/candidate")
@RequiredArgsConstructor
@Slf4j
public class CandidateController {

    private final CandidateService candidateService;

    @PostMapping("/createCandidate")
    @Operation(
        summary = "Create new candidate",
        description = "Create new candidate"
    )
    @ApiResponse(
        responseCode = "201",
        description = "HTTP Status 201 OK"
    )
    @ApiResponse(
            responseCode = "401",
            description = "HTTP Status 401 Authentication Error"
    )
    @ApiResponse(
            responseCode = "500",
            description = "HTTP Status 500"
    )
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
    @Operation(
        summary = "Get candidate",
        description = "Get candidate"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 OK"
    )
    @ApiResponse(
            responseCode = "401",
            description = "HTTP Status 401 Authentication Error"
    )
    @ApiResponse(
            responseCode = "500",
            description = "HTTP Status 500"
    )
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
    @Operation(
        summary = "Get candidate list",
        description = "Get candidate list"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 OK"
    )
    @ApiResponse(
            responseCode = "401",
            description = "HTTP Status 401 Authentication Error"
    )
    @ApiResponse(
            responseCode = "500",
            description = "HTTP Status 500"
    )
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
    @Operation(
        summary = "Update candidate",
        description = "Update candidate"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 OK"
    )
    @ApiResponse(
            responseCode = "401",
            description = "HTTP Status 401 Authentication Error"
    )
    @ApiResponse(
            responseCode = "500",
            description = "HTTP Status 500"
    )
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
    
    @DeleteMapping("deleteCandidate")
    @Operation(
        summary = "Delete candidate",
        description = "Delete candidate"
    )
    @ApiResponse(
        responseCode = "200",
        description = "HTTP Status 200 OK"
    )
    @ApiResponse(
            responseCode = "401",
            description = "HTTP Status 401 Authentication Error"
    )
    @ApiResponse(
            responseCode = "500",
            description = "HTTP Status 500"
    )
    public ResponseEntity<PharosDBMapperResponse> deleteCandidate(@RequestBody CandidateRequest candidateRequest){

        log.info("Accessed to /api/v1/candidate/deleteteCandidate endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();
        
        try {
            CandidateResponse candidateResponse = candidateService.deleteCandidate(candidateRequest);
            pharosDBMapperResponse.setData(candidateResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }
}
