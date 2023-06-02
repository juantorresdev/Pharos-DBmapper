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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.pharos.PharosDBmapper.services.AddressService;
import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;
import com.pharos.PharosDBmapper.wrappers.request.AddressRequest;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
@Slf4j
public class AddressController {

    private final AddressService addressService;
    
    @PostMapping("/createAddress")
    @Operation(
        summary = "Create new address",
        description = "Create new address to be related to a Candidate"
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
    public ResponseEntity<PharosDBMapperResponse> createAddress(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/createAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = addressService.createAddress(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @GetMapping("/getAddress")
    @Operation(
        summary = "Get address",
        description = "Get address from a Candidate"
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
    public ResponseEntity<PharosDBMapperResponse> getAddress(@RequestParam("addressId") int addressId) {

        log.info("Accessed to /api/v1/address/getAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = addressService.getAddress(addressId);
            pharosDBMapperResponse.setData(addressResponse);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @PostMapping("/getAddressList")
    @Operation(
        summary = "Get address list",
        description = "Get address list related to a Candidate"
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
    public ResponseEntity<PharosDBMapperResponse> getAddressList(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/getAddressList endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            List<AddressResponse> addressResponse = addressService.getAddressList(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @PutMapping("/updateAddress")
    @Operation(
        summary = "Update address",
        description = "Update address from a Candidate"
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
    public ResponseEntity<PharosDBMapperResponse> updateAddress(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/updateAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = addressService.updateAddress(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @DeleteMapping("/deleteAddress")
    @PutMapping("/updateAddress")
    @Operation(
        summary = "Delete address",
        description = "Delete address from a Candidate"
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
    public ResponseEntity<PharosDBMapperResponse> deleteAddress(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/updateAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = addressService.deleteAddress(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

}
