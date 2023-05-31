package com.pharos.PharosDBmapper.services;

import java.util.List;

import com.pharos.PharosDBmapper.wrappers.request.PasswordHistoryRequest;
import com.pharos.PharosDBmapper.wrappers.response.PasswordHistoryResponse;

public interface PasswordHistoryService {

    public PasswordHistoryResponse createPassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception;
    public PasswordHistoryResponse getCurrentPassword(PasswordHistoryRequest request) throws Exception;
    public PasswordHistoryResponse resetPassword(PasswordHistoryRequest request) throws Exception;
    public PasswordHistoryResponse updatePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception;
    public PasswordHistoryResponse deletePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception;
}
