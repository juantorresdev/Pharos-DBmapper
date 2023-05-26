package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.services.PasswordHistoryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/password")
@Slf4j
@RequiredArgsConstructor
public class PasswordHistoryController {

    public final PasswordHistoryService passwordHistoryService;

    @PostMapping("/createPassword")
    public ResponseEntity<PharosDBMapperResponse> createPassword(@RequestBody PasswordRequest passwordRequest){

        log.info("Accessed to /api/v1/password/createPassword endpoint");
        PharosDBMapperResponse pharosDBMapperResponse = new PharosDBMapperResponse();

        try {
            AddressResponse addressResponse = passwordServicee.createAddress(addressRequest);
            pharosDBMapperResponse.setData(addressResponse);
            
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(pharosDBMapperResponse);

    }
}