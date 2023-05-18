package com.pharos.PharosDBmapper.services;

import java.util.List;

import com.pharos.PharosDBmapper.wrappers.request.DocumentRequest;
import com.pharos.PharosDBmapper.wrappers.response.DocumentResponse;

public interface DocumentService {

    public DocumentResponse createDocument(DocumentRequest documentRequest) throws Exception;
    public DocumentResponse getDocument(int documentId) throws Exception;
    public List<DocumentResponse> getDocumentList(DocumentRequest documentRequest) throws Exception;
    public DocumentResponse updateDocument(DocumentRequest documentRequest) throws Exception;
    public DocumentResponse deleteDocument(DocumentRequest documentRequest) throws Exception;
}
