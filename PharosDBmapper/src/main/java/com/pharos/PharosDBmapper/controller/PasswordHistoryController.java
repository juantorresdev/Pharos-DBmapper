package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.services.PasswordHistoryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/password")
@Slf4j
@RequiredArgsConstructor
public class PasswordHistoryController {

    public final PasswordHistoryService passwordHistoryService;
}