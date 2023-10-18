package com.james.springbootapp.service;

import com.james.springbootapp.entity.Address;
import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private MyProjectService myProjectService;

    //Do I need to mark these as beans?
    @Override
    public List<Address> findAllAddresses() {
        List<Address> addressData = addressRepository.findAll();
        addressData.stream()
                .forEach(System.out::println);
        return addressData;
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address createNewAddress(Address address) {
        address.getEmployee();
        System.out.println("********" + address.getEmployee());
        return addressRepository.save(address);
    }




}
