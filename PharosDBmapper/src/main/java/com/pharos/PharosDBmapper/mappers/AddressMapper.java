package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.wrappers.request.AddressRequest;
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AddressMapper {

    private final ModelMapper modelMapper;

    public AddressDTO addressToDto(Address address){
        return modelMapper.map(address, AddressDTO.class);
    }

    public Address addressRequestToAddress(AddressRequest addressRequest){
        return modelMapper.map(addressRequest, Address.class);
    }

    public Address dtoToAddress(AddressDTO addressDTO){
        return modelMapper.map(addressDTO, Address.class);
    }

    public List<AddressDTO> addressListoToDtoList(List<Address> addressList){
        List<AddressDTO> addressDTOList = new ArrayList<>();
        return addressDTOList;
    }

    public AddressResponse addressToResponse(Address address){
        AddressResponse addressResponse = new AddressResponse();
        return addressResponse;
    }

    public List<AddressResponse> addressListoToResponseList(List<Address> addressList){
        List<AddressResponse> addressDTOList = new ArrayList<>();
        return addressDTOList;
    }
}
