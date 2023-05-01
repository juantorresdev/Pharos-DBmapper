package com.pharos.PharosDBmapper.services;

import com.pharos.PharosDBmapper.dto.AddressDTO;

import java.util.List;

public interface AddressService {

    public AddressDTO createAddress(AddressDTO addressDTO) throws Exception;
    public AddressDTO readAddress(AddressDTO addressDTO) throws Exception;
    public List<AddressDTO> readAddressList(AddressDTO addressDTO) throws Exception;
    public AddressDTO updateAddress(AddressDTO addressDTO) throws Exception;
    public AddressDTO deleteAddress(AddressDTO addressDTO) throws Exception;


}
