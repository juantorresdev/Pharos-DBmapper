package com.pharos.PharosDBmapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
