package com.pharos.PharosDBmapper.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PharosDBMapperException extends RuntimeException{

    private int code;
    private String message;

}
