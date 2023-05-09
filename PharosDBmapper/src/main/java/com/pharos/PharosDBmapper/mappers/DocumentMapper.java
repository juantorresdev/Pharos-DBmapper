package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.DocumentDTO;
import com.pharos.PharosDBmapper.entities.Document;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentMapper {

    private final ModelMapper modelMapper;

    public DocumentDTO documentToDto(Document document){
        DocumentDTO documentDTO = modelMapper.map(document, DocumentDTO.class);
        return documentDTO;
    }

    public Document dtoToDocument(DocumentDTO documentDTO){
        Document document = modelMapper.map(documentDTO, do);
        return document;
    }
}
