package com.pharos.PharosDBmapper.services;

import java.util.List;

import com.pharos.PharosDBmapper.wrappers.request.PasswordHistoryRequest;
import com.pharos.PharosDBmapper.wrappers.response.PasswordHistoryResponse;

public interface PasswordHistoryService {

    public PasswordHistoryResponse createPassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception;
    public PasswordHistoryResponse getPassword(int passwordId) throws Exception;
    public List<PasswordHistoryResponse> getPasswordList(PasswordHistoryRequest passwordHistoryRequest) throws Exception;
    public PasswordHistoryResponse updatePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception;
    public PasswordHistoryResponse deletePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception;
}
