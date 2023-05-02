package com.pharos.PharosDBmapper.wrappers.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PharosDBMapperResponse {

    private String responseCode;
    private String responseMessage;
    private String responseSubject;
    private String messageType;
    private String transId;
    private Object data;

}
