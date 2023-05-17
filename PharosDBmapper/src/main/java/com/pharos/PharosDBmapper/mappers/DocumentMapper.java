package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.DocumentDTO;
import com.pharos.PharosDBmapper.entities.Document;
import com.pharos.PharosDBmapper.wrappers.request.DocumentRequest;
import com.pharos.PharosDBmapper.wrappers.response.DocumentResponse;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

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

    public Document documentRequestToDocument(DocumentRequest documentRequest){
        return modelMapper.map(documentRequest, Document.class);
    }

    public DocumentResponse documentToResponse(Document document){
        return modelMapper.map(document, DocumentResponse.class);
    }

    public List<DocumentDTO> documentListToDtoList(List<Document> documentList){
        return documentList.stream()
        .map(document -> modelMapper.map(document, DocumentDTO.class))
        .collect(Collectors.toList());
    }

    public List<DocumentResponse> documentListToResponseList(List<Document> documentList){
        return documentList.stream()
        .map(document -> modelMapper.map(document, DocumentResponse.class))
        .collect(Collectors.toList());
    }
}
