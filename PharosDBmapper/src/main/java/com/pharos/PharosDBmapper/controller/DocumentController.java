package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.services.DocumentService;
import com.pharos.PharosDBmapper.services.NationalityService;
import com.pharos.PharosDBmapper.wrappers.request.DocumentRequest;
import com.pharos.PharosDBmapper.wrappers.response.DocumentResponse;
import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/document")
@RequiredArgsConstructor
@Slf4j
public class DocumentController {

    private final DocumentService documentService;

    @PostMapping("/createDocument")
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

}
