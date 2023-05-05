package com.pharos.PharosDBmapper.mappers;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.entities.Address;
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressMapper {

    public AddressDTO addressToDto(Address address){
        AddressDTO addressDTO = new AddressDTO();
        return addressDTO;
    }

    public Address dtoToAddress(AddressDTO addressDTO){
        Address address = new Address();
        return address;
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
