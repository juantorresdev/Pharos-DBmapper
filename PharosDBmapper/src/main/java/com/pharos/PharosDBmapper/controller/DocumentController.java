package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.services.DocumentService;
import com.pharos.PharosDBmapper.services.NationalityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/candidate")
@RequiredArgsConstructor
@Slf4j
public class DocumentController {

    private final DocumentService documentService;
}
