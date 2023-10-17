package com.james.springbootapp.controller;

import com.james.springbootapp.entity.Address;
import com.james.springbootapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/get-addresses")
    public List<Address> fetchAddressList(){
        return addressService.findAllAddresses();
    }


    @PostMapping("/new-address")
    public Address createNewAddress(Address address){
        return addressService.createNewAddress(address);
    }

    // This just adding null records to my address table
    @PutMapping("/update-address")
    public Address updateAddress(Address address){
        return addressService.updateAddress(address);
    }


}
