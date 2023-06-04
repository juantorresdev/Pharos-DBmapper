package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.enums.ResponseMessagesEnum;
import com.pharos.PharosDBmapper.services.DocumentService;
import com.pharos.PharosDBmapper.wrappers.request.DocumentRequest;
import com.pharos.PharosDBmapper.wrappers.response.DocumentResponse;
import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

@RestController
@RequestMapping("/api/v1/document")
@RequiredArgsConstructor
@Slf4j
public class DocumentController {

    private final DocumentService documentService;

    @PostMapping("/createDocument")
    @Operation(
        summary = "Create new document",
        description = "Create new document"
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
    public ResponseEntity<PharosDBMapperResponse> createDocument(@RequestBody DocumentRequest documentRequest){

        log.info("Accessed to /api/v1/document/createDocument endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try{
            DocumentResponse documentResponse = documentService.createDocument(documentRequest);
            pharosDBMapperResponse.setData(documentResponse);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(pharosDBMapperResponse);

    }

    @GetMapping("/getDocument")
    @Operation(
        summary = "Get document",
        description = "Get document"
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
    public ResponseEntity<PharosDBMapperResponse> getDocument(@RequestParam("documentId") int documentId) {

        log.info("Accessed to /api/v1/document/getDocument endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            DocumentResponse documentResponse = documentService.getDocument(documentId);
            pharosDBMapperResponse.setData(documentResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @PostMapping("/getDocumentList")
    @Operation(
        summary = "Get document",
        description = "Get document"
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
    public ResponseEntity<PharosDBMapperResponse> getDocumentList(@RequestBody DocumentRequest documentRequest) {
        
        log.info("Accessed to /api/v1/document/getDocumentList endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            List<DocumentResponse> documentResponse = documentService.getDocumentList(documentRequest);
            pharosDBMapperResponse.setData(documentResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }

    @PutMapping("/updateDocument")
    @Operation(
        summary = "Get document",
        description = "Get document"
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
    public ResponseEntity<PharosDBMapperResponse> updateDocument(@RequestBody DocumentRequest documentRequest){
        log.info("Accessed to /api/v1/document/updateDocument");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            DocumentResponse documentResponse = documentService.updateDocument(documentRequest);
            pharosDBMapperResponse.setData(documentResponse);
            pharosDBMapperResponse.setResponseCode(Integer.toString(HttpStatus.OK.value()));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }

    @DeleteMapping("/deleteDocument")
    @Operation(
        summary = "Get document",
        description = "Get document"
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
    public ResponseEntity<PharosDBMapperResponse> deleteDocument(@RequestBody DocumentRequest documentRequest){
        log.info("Accessed to /api/v1/document/deleteDocument");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            DocumentResponse documentResponse = documentService.updateDocument(documentRequest);
            pharosDBMapperResponse.setData(documentResponse);
            pharosDBMapperResponse.setResponseMessage(ResponseMessagesEnum.SUCCESS.getMessage());
            pharosDBMapperResponse.setResponseCode(ResponseMessagesEnum.SUCCESS.getCode());
        } catch (Exception e) {
            pharosDBMapperResponse.setResponseMessage(ResponseMessagesEnum.FAIL.getMessage());
            pharosDBMapperResponse.setResponseCode(ResponseMessagesEnum.FAIL.getCode());
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }
}
