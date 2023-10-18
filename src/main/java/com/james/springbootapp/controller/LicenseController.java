package com.james.springbootapp.controller;

import com.james.springbootapp.DTO.LicensesDTO;
import com.james.springbootapp.entity.Licenses;
import com.james.springbootapp.repository.LicensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicenseController {
    @Autowired
    private LicensesRepository licensesRepository;

    @PostMapping("/new-license")
    public ResponseEntity<LicensesDTO> createNewLicense(@RequestBody Licenses licenses) {
        Licenses savedLicense = licensesRepository.save(licenses);
        LicensesDTO responseDTO = LicensesDTO.fromLicenses(savedLicense);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
}
