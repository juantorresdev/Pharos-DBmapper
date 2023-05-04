package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.services.AddressService;
import com.pharos.PharosDBmapper.services.NationalityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
@Slf4j
public class AddressController {

    private final AddressService addressService;
    
    @GetMapping("/getAddress")
    public ResponseEntity<PharosDBMapperResponse> getAddress(@RequestParam("idAddress") int idAddress){

        Address address = addressService.readAddress(null);

        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();
        ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.OK);
        return bodyBuilder.body(pharosDBMapperResponse);

    }
}
