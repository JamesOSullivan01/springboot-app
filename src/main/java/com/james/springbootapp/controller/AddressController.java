package com.james.springbootapp.controller;

import com.james.springbootapp.entity.Address;
import com.james.springbootapp.entity.AddressDTO;
import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.repository.AddressRepository;
import com.james.springbootapp.service.AddressService;
import com.james.springbootapp.service.MyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/")

public class AddressController {
    @Autowired
    private AddressService addressService;

    @Autowired
    private MyProjectService myProjectService;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/get-addresses")
    public List<Address> fetchAddressList(){
        return addressService.findAllAddresses();
    }


    @PostMapping("/new-address")
    public Address createNewAddress(@RequestBody AddressDTO address){
        return addressService.createNewAddress(address);
    }

    // This just adding null records to my address table
    @PutMapping("/update-address")
    public Address updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }


}
