package com.james.springbootapp.service;

import com.james.springbootapp.entity.Address;
import com.james.springbootapp.entity.AddressDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AddressService {
    List<Address> findAllAddresses();

    Address updateAddress(Address address);

    Address createNewAddress(AddressDTO address);
}
