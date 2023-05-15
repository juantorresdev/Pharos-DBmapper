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
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;
import com.pharos.PharosDBmapper.wrappers.request.AddressRequest;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
@Slf4j
public class AddressController {

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

        try {
            AddressResponse addressResponse = addressService.getAddress(addressId);
            pharosDBMapperResponse.setData(addressResponse);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @PostMapping("/getAddressList")
    public ResponseEntity<PharosDBMapperResponse> getAddressList(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/getAddressList endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            List<AddressResponse> addressResponse = addressService.getAddressList(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @PutMapping("/updateAddress")
    public ResponseEntity<PharosDBMapperResponse> updateAddress(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/updateAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = addressService.updateAddress(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

    @DeleteMapping("/deleteAddress")
    public ResponseEntity<PharosDBMapperResponse> deleteAddress(@RequestBody AddressRequest addressRequest){

        log.info("Accessed to /api/v1/address/updateAddress endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = addressService.deleteAddress(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }

}
