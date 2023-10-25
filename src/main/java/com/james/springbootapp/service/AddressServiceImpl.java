package com.james.springbootapp.service;

import com.james.springbootapp.entity.Address;
import com.james.springbootapp.entity.AddressDTO;
import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.repository.AddressRepository;
import com.james.springbootapp.repository.MyEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private MyProjectService myProjectService;

    @Autowired
    private MyEmployeeRepository myEmployeeRepository;


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
    public Address createNewAddress(AddressDTO address) {
        Integer employeeId = address.getEmployeeId();
        System.out.println("*********" + address.getEmployeeId());
        Address entity = new Address();
        Employee employee = myEmployeeRepository.getById(Long.valueOf(address.getEmployeeId()));
        entity.setAddress(address.getAddress());
        entity.setCity(address.getCity());
        entity.setState(address.getState());
        entity.setZipcode(address.getZipcode());
        entity.setEmployee(employee);
        return addressRepository.save(entity);
    }




}
