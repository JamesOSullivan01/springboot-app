package com.james.springbootapp.controller;
import com.james.springbootapp.entity.LicenseDTO;
import com.james.springbootapp.entity.Licenses;
import com.james.springbootapp.repository.LicensesRepository;
import com.james.springbootapp.service.LicensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/v1/")
public class LicenseController {
    @Autowired
    private LicensesRepository licensesRepository;

    @Autowired
    private LicensesService licensesService;

    @PostMapping("/new-license")
    public Licenses newLicense(@RequestBody LicenseDTO licenses){
        return licensesService.saveLicense(licenses);
    }

    @GetMapping("/find-expiring-licenses")
    public List<Licenses> findExpiring(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date){
        return licensesService.findLicensesAboutToExpire(date.atStartOfDay());
    }



    //find out how to use date formatter
    //2023-01-26 17:15:26
    //delete functionality for delete employee and it should delete address and license
    //return data
}
