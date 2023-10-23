package com.james.springbootapp.controller;
import com.james.springbootapp.entity.Licenses;
import com.james.springbootapp.repository.LicensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class LicenseController {
    @Autowired
    private LicensesRepository licensesRepository;

//    @PostMapping("/new-license")
//    public


    //find out how to use date formatter
    //2023-01-26 17:15:26
    //delete functionality for delete employee and it should delete address and license
    //return data
}
