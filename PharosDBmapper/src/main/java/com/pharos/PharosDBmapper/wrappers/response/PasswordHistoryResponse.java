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
public class PasswordHistoryResponse {
    private Integer id;
    private String password;
    private String enable;
}
