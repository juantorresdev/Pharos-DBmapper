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
public class PasswordHistoryRequest {
    private Integer id;
    private String password;
    private String enable;
}
