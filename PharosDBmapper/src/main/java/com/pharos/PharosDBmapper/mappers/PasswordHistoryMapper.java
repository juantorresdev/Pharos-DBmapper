package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.PasswordHistoryDTO;
import com.pharos.PharosDBmapper.entities.PasswordHistory;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PasswordHistoryMapper {

    private final ModelMapper modelMapper;

    public PasswordHistoryDTO passwordHistoryToDto(PasswordHistory passwordHistory){
        PasswordHistoryDTO passwordHistoryDTO = new PasswordHistoryDTO();
        return passwordHistoryDTO;
    }

    public PasswordHistory dtoToPasswordHistory(PasswordHistoryDTO passwordHistoryDTO){
        PasswordHistory passwordHistory = new PasswordHistory();
        return passwordHistory;
    }
}
