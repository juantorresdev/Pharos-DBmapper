package com.pharos.PharosDBmapper.wrappers.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressResponse {
    
    private Integer id;
    private String street;
    private String city;
    private String province;
    private String postcode;
    private String country;
    private String status;

}
