package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.mappers.AddressMapper;
import com.pharos.PharosDBmapper.repository.AddressRepository;
import com.pharos.PharosDBmapper.services.AddressService;
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
    public AddressDTO createAddress(AddressDTO addressDTO) throws Exception {

        Address address = addressMapper.dtoToAddress(addressDTO);
        addressRepository.save(address);

        addressDTO = addressMapper.addressToDto(address);

        return addressDTO;
    }

    @Override
    public AddressDTO readAddress(AddressDTO addressDTO) throws Exception {

        Address address = addressRepository.findById(addressDTO.getId()).orElseThrow();

        return addressMapper.addressToDto(address);
    }

    //TODO - Read Address Method implementing JPA Criteria

    @Override
    public List<AddressDTO> readAddressList(AddressDTO addressDTO) throws Exception {

        List<Address> addressList = addressRepository.findAll();
        List<AddressDTO> addressDTOList = addressMapper.addressListoToDtoList(addressList);

        // TODO - Implement pagiantion
        return addressDTOList;
    }

    @Override
    public AddressDTO updateAddress(AddressDTO addressDTO) throws Exception {
        return null;
    }

    @Override
    public AddressDTO deleteAddress(AddressDTO addressDTO) throws Exception {
        return null;
    }
}