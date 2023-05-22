package com.pharos.PharosDBmapper.enums;

import java.util.HashMap;
import java.util.Map;

public enum ResponseMessagesEnum {

    SUCCESS("200", "SUCCESS"),
	FAIL("999", "FAIL"),
	ERROR_CONECTION("-1", "ERROR CONECTION RENAPO"),
	GENERAL_ERROR("500", "INTERNAL ERROR");

    protected static final Map<String,ResponseMessagesEnum> responsesMap = new HashMap<String,ResponseMessagesEnum>();

    static {
        for(ResponseMessagesEnum response:ResponseMessagesEnum.values())
            responsesMap.put(response.getMessage(), response);
    }

    private final String code;
    private final String message;

    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    private ResponseMessagesEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
