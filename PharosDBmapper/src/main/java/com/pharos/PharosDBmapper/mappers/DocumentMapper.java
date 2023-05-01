package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.DocumentDTO;
import com.pharos.PharosDBmapper.entities.Document;
import org.springframework.stereotype.Component;

@Component
public class DocumentMapper {

    public DocumentDTO documentToDto(Document document){
        DocumentDTO documentDTO = new DocumentDTO();
        return documentDTO;
    }

    public Document dtoToDocument(DocumentDTO documentDTO){
        Document document = new Document();
        return document;
    }
}
