package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.repository.NationalityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class NationalityServiceImpl {

    private final NationalityRepository nationalityRepository;

}
