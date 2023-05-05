package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.services.AddressService;
import com.pharos.PharosDBmapper.services.NationalityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


import com.pharos.PharosDBmapper.wrappers.response.*;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
@Slf4j
public class AddressController {

    private final AddressService addressService;
    
    @GetMapping("/getAddress")
    public ResponseEntity<PharosDBMapperResponse> getAddress(@RequestParam("addressId") int addressId) {

        log.info("Accessed to /api/v1/address/getAddress endpoint");

        try {
            AddressResponse addressResponse = addressService.readAddress(addressId);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.OK);
        return bodyBuilder.body(pharosDBMapperResponse);

    }
}
