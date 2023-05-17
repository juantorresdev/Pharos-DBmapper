package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.PasswordHistoryDTO;
import com.pharos.PharosDBmapper.entities.PasswordHistory;
import com.pharos.PharosDBmapper.wrappers.request.PasswordHistoryRequest;
import com.pharos.PharosDBmapper.wrappers.response.PasswordHistoryResponse;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PasswordHistoryMapper {

    private final ModelMapper modelMapper;

    public PasswordHistoryDTO passwordHistoryToDto(PasswordHistory passwordHistory){
        return modelMapper.map(passwordHistory, PasswordHistoryDTO.class);
    }

    public PasswordHistory dtoToPasswordHistory(PasswordHistoryDTO passwordHistoryDTO){
        return modelMapper.map(passwordHistoryDTO, PasswordHistory.class);
    }

    public PasswordHistory passwordRequestToPasswordHistory(PasswordHistoryRequest passwordHistoryRequest){
        return modelMapper.map(passwordHistoryRequest, PasswordHistory.class);
    }
    
    public PasswordHistoryResponse passwordToResposnse(PasswordHistory passwordHistory){
        return modelMapper.map(passwordHistory, PasswordHistoryResponse.class);
    }

    public List<PasswordHistoryDTO> passwordHistoryListToDtoList(List<PasswordHistory> passwordHistoryList){
        return passwordHistoryList.stream()
        .map(passwordHistory -> modelMapper.map(passwordHistoryList, PasswordHistoryDTO.class))
        .collect(Collectors.toList());
    }

    public List<PasswordHistoryResponse> passwordHistoryListToResponseList(List<PasswordHistory> passwordHistoryList){
        return passwordHistoryList.stream()
        .map(passwordHistory -> modelMapper.map(passwordHistoryList, PasswordHistoryResponse.class))
        .collect(Collectors.toList());
    }
}
