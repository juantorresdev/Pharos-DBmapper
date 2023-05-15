package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.DocumentDTO;
import com.pharos.PharosDBmapper.entities.Document;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentMapper {

    private final ModelMapper modelMapper;

    public DocumentDTO documentToDto(Document document){
        return modelMapper.map(document, DocumentDTO.class);
    }

    public Document dtoToDocument(DocumentDTO documentDTO){
        return modelMapper.map(documentDTO, Document.class);
    }
}
