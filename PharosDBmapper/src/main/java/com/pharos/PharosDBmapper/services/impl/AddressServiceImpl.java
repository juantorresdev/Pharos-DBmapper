package com.pharos.PharosDBmapper.services.impl;

import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.mappers.AddressMapper;
import com.pharos.PharosDBmapper.repository.AddressRepository;
import com.pharos.PharosDBmapper.services.AddressService;
import com.pharos.PharosDBmapper.wrappers.request.AddressRequest;
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
    public AddressResponse createAddress(AddressRequest addressRequest) throws Exception {

        log.info("Accessed to createAddress service - createAddress");

        Address address = addressMapper.addressRequestToAddress(addressRequest);
        addressRepository.save(address);

        return addressMapper.addressToResponse(address);
    }

    @Override
    public AddressResponse getAddress(int addressId) throws Exception {

        log.info("Accessed to createAddress service - getAddress");
        Address address = addressRepository.findById(addressId).orElseThrow();

        return addressMapper.addressToResponse(address);
    }

    //TODO - Read Address Method implementing JPA Criteria

    @Override
    public List<AddressResponse> getAddressList(AddressRequest addressRequest) throws Exception {

        log.info("Accessed to createAddress service - getAddressList");
        List<Address> addressList = addressRepository.findAll();

        // TODO - Implement pagenation
        return addressMapper.addressListoToResponseList(addressList);
    }

    @Override
    public AddressResponse updateAddress(AddressRequest addressRequest) throws Exception {
        log.info("Accessed to createAddress service - updateAddress");

        //Address address = ((AddressService) addressRepository).updateAddress(addressMapper.addressRequestToAddress(addressRequest));

        return null;
    }

    @Override
    public AddressResponse deleteAddress(AddressRequest addressRequest) throws Exception {
        log.info("Accessed to createAddress service - deleteAddress");

        //Address address = addressRepository.deleteById(addressRequest.getId());
        return null;
    }
}