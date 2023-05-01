package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.repository.GenderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class GenderServiceImpl {

    private final GenderRepository genderRepository;
}
