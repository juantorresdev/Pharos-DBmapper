package com.pharos.PharosDBmapper.services;

import com.pharos.PharosDBmapper.wrappers.request.AddressRequest;
import com.pharos.PharosDBmapper.wrappers.response.AddressResponse;

import java.util.List;

public interface AddressService {

    public AddressResponse createAddress(AddressRequest addressRequest) throws Exception;
    public AddressResponse getAddress(int addressId) throws Exception;
    public List<AddressResponse> getAddressList(AddressRequest addressRequest) throws Exception;
    public AddressResponse updateAddress(AddressRequest addressRequest) throws Exception;
    public AddressResponse deleteAddress(AddressRequest addressRequest) throws Exception;


}
