package com.pharos.PharosDBmapper.wrappers.request;

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
public class AddressRequest {
    private String street;
    private String city;
    private String province;
    private String postcode;
    private String country;
    private String status;
}
