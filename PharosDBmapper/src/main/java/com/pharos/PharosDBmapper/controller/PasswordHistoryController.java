package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.services.PasswordHistoryService;
import com.pharos.PharosDBmapper.wrappers.request.PasswordHistoryRequest;
import com.pharos.PharosDBmapper.wrappers.response.PasswordHistoryResponse;
import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/password")
@Slf4j
@RequiredArgsConstructor
public class PasswordHistoryController {

    public final PasswordHistoryService passwordHistoryService;

    @PostMapping("/createPassword")
    public ResponseEntity<PharosDBMapperResponse> createPassword(@RequestBody PasswordHistoryRequest passwordRequest){

        log.info("Accessed to /api/v1/password/createPassword endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            PasswordHistoryResponse passwordHistoryResponse = passwordHistoryService.createPassword(passwordRequest);
            pharosDBMapperResponse.setData(passwordHistoryResponse);
            
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @GetMapping("/getCurrentPassword")
    public ResponseEntity<PharosDBMapperResponse> getCurrentPassword(@RequestParam("password") String password) {

        log.info("Accessed to /api/v1/password/getCurrentPassword endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            PasswordHistoryResponse passwordResponse = passwordHistoryService.getCurrentPassword(password);
            pharosDBMapperResponse.setData(passwordResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }

    @PutmMapping("/resetPassword")
    public ResponseEntity<PharosDBMapperResponse> resetPassword(@RequestBody PasswordHistoryRequest request){

        log.info("Accessed to /api/v1/password/resetPassword endpoint");

        try {
            PasswordHistoryResponse passwordResponse = passwordHistoryService.getCurrentPassword(password);
            pharosDBMapperResponse.setData(passwordResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

   }
}