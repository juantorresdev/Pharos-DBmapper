package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.repository.PasswordHistoryRepository;
import com.pharos.PharosDBmapper.services.PasswordHistoryService;
import com.pharos.PharosDBmapper.wrappers.request.PasswordHistoryRequest;
import com.pharos.PharosDBmapper.wrappers.response.PasswordHistoryResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PasswordHistoryServiceImpl implements PasswordHistoryService{

    private final PasswordHistoryRepository passwordHistoryRepository;

    @Override
    public PasswordHistoryResponse createPassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPassword'");
    }

    @Override
    public PasswordHistoryResponse getCurrentPassword(String passwordId) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentPassword'");
    }

    @Override
    public List<PasswordHistoryResponse> getPasswordList(PasswordHistoryRequest passwordHistoryRequest)
            throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPasswordList'");
    }

    @Override
    public PasswordHistoryResponse updatePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public PasswordHistoryResponse deletePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePassword'");
    }
}
