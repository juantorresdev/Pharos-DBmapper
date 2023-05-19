package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.entities.Document;
import com.pharos.PharosDBmapper.exception.PharosDBMapperException;
import com.pharos.PharosDBmapper.mappers.DocumentMapper;
import com.pharos.PharosDBmapper.repository.DocumentRepository;
import com.pharos.PharosDBmapper.services.DocumentService;
import com.pharos.PharosDBmapper.wrappers.request.DocumentRequest;
import com.pharos.PharosDBmapper.wrappers.response.DocumentResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService{

    private final DocumentRepository documentRepository;
    private final DocumentMapper documentMapper;

    @Override
    public DocumentResponse createDocument(DocumentRequest documentRequest) throws Exception {
        
        log.info("Accessed to Document service - createDocument");
        Document document = new Document();

        try{
            document = documentMapper.documentRequestToDocument(documentRequest);
            documentRepository.save(document);
        } catch(Exception exception){
            throw new PharosDBMapperException(500, "Unable to create new record");
        }
        return documentMapper.documentToResponse(document);
    }

    @Override
    public DocumentResponse getDocument(int documentId) throws Exception {
        
        log.info("Accessed to Document service - getDocument");
        Document document = new Document();

        try {
            document = documentRepository.findById(documentId).orElseThrow();
        } catch (Exception e) {
            throw new PharosDBMapperException(500, "Unable to get record");
        }

        return documentMapper.documentToResponse(document);

    }

    //TODO - Read Address Method implementing JPA Criteria

    @Override
    public List<DocumentResponse> getDocumentList(DocumentRequest documentRequest) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("
        Unimplemented method 'getDocumentList'");
    }

    @Override
    public DocumentResponse updateDocument(DocumentRequest documentRequest) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDocument'");
    }

    @Override
    public DocumentResponse deleteDocument(DocumentRequest documentRequest) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDocument'");
    }
}
