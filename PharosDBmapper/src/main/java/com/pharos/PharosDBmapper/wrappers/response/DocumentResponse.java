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
public class DocumentResponse {
    private Integer id;
    private String identityDocument;
    private String enable;
}
