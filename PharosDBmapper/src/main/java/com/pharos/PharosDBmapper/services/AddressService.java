package com.pharos.PharosDBmapper.services;

import com.pharos.PharosDBmapper.dto.AddressDTO;
import com.pharos.PharosDBmapper.wrappers.request.AddressRequest;
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;

import java.util.List;

public interface AddressService {

    public AddressResponse createAddress(AddressRequest addressRequest) throws Exception;
    public AddressResponse readAddress(int addressId) throws Exception;
    public List<AddressResponse> readAddressList(AddressRequest addressRequest) throws Exception;
    public AddressResponse updateAddress(AddressRequest addressRequest) throws Exception;
    public AddressResponse deleteAddress(AddressRequest addressRequest) throws Exception;


}
