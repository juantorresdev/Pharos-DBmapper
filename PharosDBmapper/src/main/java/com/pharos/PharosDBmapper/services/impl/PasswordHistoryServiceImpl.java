package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.entities.PasswordHistory;
import com.pharos.PharosDBmapper.mappers.PasswordHistoryMapper;
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
    private final PasswordHistoryMapper historyMapper;

    @Override
    public PasswordHistoryResponse createPassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        
        log.info("Accessed to PasswordHistory service - createPassword");

        PasswordHistory passwordHistory = historyMapper.passwordRequestToPasswordHistory(passwordHistoryRequest);
        passwordHistoryRepository.save(passwordHistory);

        return historyMapper.passwordToResposnse(passwordHistory);
        
    }

    @Override
    public PasswordHistoryResponse getCurrentPassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        log.info("Accessed to PasswordHistory service - getCurrentPassword");

        PasswordHistory passwordHistory = historyMapper.passwordRequestToPasswordHistory(passwordHistoryRequest);
        passwordHistoryRepository.findById(passwordHistory.getId());


        return historyMapper.passwordToResposnse(passwordHistory);
    }

    @Override
    public PasswordHistoryResponse resetPassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        
        log.info("Accessed to PasswordHistory service - resetPassword");

        PasswordHistory passwordHistory = historyMapper.passwordRequestToPasswordHistory(passwordHistoryRequest);
        passwordHistoryRepository.save(passwordHistory);


        return historyMapper.passwordToResposnse(passwordHistory);
    }

    @Override
    public PasswordHistoryResponse updatePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        log.info("Accessed to PasswordHistory service - updatePassword");

        PasswordHistory passwordHistory = historyMapper.passwordRequestToPasswordHistory(passwordHistoryRequest);
        passwordHistoryRepository.save(passwordHistory);


        return historyMapper.passwordToResposnse(passwordHistory);
    }

    @Override
    public PasswordHistoryResponse deletePassword(PasswordHistoryRequest passwordHistoryRequest) throws Exception {
        log.info("Accessed to PasswordHistory service - deletePassword");

        PasswordHistory passwordHistory = historyMapper.passwordRequestToPasswordHistory(passwordHistoryRequest);
        passwordHistoryRepository.save(passwordHistory);


        return historyMapper.passwordToResposnse(passwordHistory);
    }

}
