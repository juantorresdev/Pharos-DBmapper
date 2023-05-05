package com.pharos.PharosDBmapper.services;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;

import java.util.List;

public interface AddressService {

    public AddressResponse createAddress(AddressDTO addressDTO) throws Exception;
    public AddressResponse readAddress(int addressId) throws Exception;
    public List<AddressResponse> readAddressList(AddressDTO addressDTO) throws Exception;
    public AddressResponse updateAddress(AddressDTO addressDTO) throws Exception;
    public AddressResponse deleteAddress(AddressDTO addressDTO) throws Exception;


}
