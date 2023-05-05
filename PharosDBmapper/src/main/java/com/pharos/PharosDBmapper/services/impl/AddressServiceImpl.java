package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.mappers.AddressMapper;
import com.pharos.PharosDBmapper.repository.AddressRepository;
import com.pharos.PharosDBmapper.services.AddressService;
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;


    @Override
    public AddressResponse createAddress(AddressDTO addressDTO) throws Exception {

        log.info("Accessed to createAddress service");

        Address address = addressMapper.dtoToAddress(addressDTO);
        addressRepository.save(address);

        AddressResponse addressResponse = addressMapper.addressToResponse(address);

        return addressMapper.addressToResponse(address);
    }

    @Override
    public AddressResponse readAddress(int addressId) throws Exception {

        Address address = addressRepository.findById(addressId).orElseThrow();

        return addressMapper.addressToResponse(address);
    }

    //TODO - Read Address Method implementing JPA Criteria

    @Override
    public List<AddressResponse> readAddressList(AddressDTO addressDTO) throws Exception {

        List<Address> addressList = addressRepository.findAll();

        // TODO - Implement pagenation
        return addressMapper.addressListoToResponseList(addressList);
    }

    @Override
    public AddressResponse updateAddress(AddressDTO addressDTO) throws Exception {
        return null;
    }

    @Override
    public AddressResponse deleteAddress(AddressDTO addressDTO) throws Exception {
        return null;
    }
}