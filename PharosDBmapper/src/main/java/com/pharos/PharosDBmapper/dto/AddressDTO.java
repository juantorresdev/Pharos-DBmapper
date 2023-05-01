package com.pharos.PharosDBmapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    @JsonProperty
    private Integer id;
    @JsonProperty
    private String street;
    @JsonProperty
    private String city;
    @JsonProperty
    private String province;
    @JsonProperty
    private String postcode;
    @JsonProperty
    private String country;
    @JsonProperty
    private String status;
}
