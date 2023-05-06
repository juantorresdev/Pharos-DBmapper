package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.services.AddressService;
import com.pharos.PharosDBmapper.services.NationalityService;
import com.pharos.PharosDBmapper.services.impl.AddressServiceImpl;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.pharos.PharosDBmapper.wrappers.response.PharosDBMapperResponse;
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;
import com.pharos.PharosDBmapper.wrappers.request.AddressRequest;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
@Slf4j
public class AddressController {

    @NonNull
    private final AddressService addressService;
    
    @PostMapping("/createAddress")
    public ResponseEntity<PharosDBMapperResponse> createAddress(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/createAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = addressService.createAddress(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @GetMapping("/getAddress")
    public ResponseEntity<PharosDBMapperResponse> getAddress(@RequestParam("addressId") int addressId) {

        log.info("Accessed to /api/v1/address/getAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();
        BodyBuilder bodyBuilder;

        try {
            AddressResponse addressResponse = addressService.readAddress(addressId);
            bodyBuilder = ResponseEntity.status(HttpStatus.OK);
        } catch (Exception e) {
            bodyBuilder = ResponseEntity.status(HttpStatus.NOT_FOUND);
        }
        return bodyBuilder.body(pharosDBMapperResponse);

    }

}
