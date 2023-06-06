package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.services.PasswordHistoryService;
import com.pharos.PharosDBmapper.wrappers.request.PasswordHistoryRequest;
import com.pharos.PharosDBmapper.wrappers.response.PasswordHistoryResponse;
import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    @Operation(
        summary = "Create new password",
        description = "Create new password"
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
    @Operation(
        summary = "Get current password",
        description = "Get current password"
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
    public ResponseEntity<PharosDBMapperResponse> getCurrentPassword(@RequestBody PasswordHistoryRequest passwordRequest) {

        log.info("Accessed to /api/v1/password/getCurrentPassword endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            PasswordHistoryResponse passwordResponse = passwordHistoryService.getCurrentPassword(passwordRequest);
            pharosDBMapperResponse.setData(passwordResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);
    }

    @PutMapping("/resetPassword")
    @Operation(
        summary = "Reset current password",
        description = "Reset current password"
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
    public ResponseEntity<PharosDBMapperResponse> resetPassword(@RequestBody PasswordHistoryRequest request){

        log.info("Accessed to /api/v1/password/resetPassword endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            PasswordHistoryResponse passwordResponse = passwordHistoryService.resetPassword(request);
            pharosDBMapperResponse.setData(passwordResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

   }

   @PutMapping("/deletePassword")
    @Operation(
        summary = "Reset current password",
        description = "Reset current password"
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
    public ResponseEntity<PharosDBMapperResponse> deletePassword(@RequestBody PasswordHistoryRequest request){

        log.info("Accessed to /api/v1/password/resetPassword endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            PasswordHistoryResponse passwordResponse = passwordHistoryService.deletePassword(request);
            pharosDBMapperResponse.setData(passwordResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

   }
}