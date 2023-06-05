package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<PharosDBMapperResponse> health(){
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();
        log.info("Accessed to /api/health endpoint");
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.OK);
        return bodyBuilder.body(pharosDBMapperResponse);
    }

}
