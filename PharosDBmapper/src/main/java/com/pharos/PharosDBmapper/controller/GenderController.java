package com.pharos.PharosDBmapper.controller;

import com.pharos.PharosDBmapper.repository.GenderRepository;
import com.pharos.PharosDBmapper.services.NationalityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gender")
@RequiredArgsConstructor
@Slf4j
public class GenderController {

    private final GenderRepository genderRepository;
}
