package com.james.springbootapp.service;

import com.james.springbootapp.entity.Licenses;
import com.james.springbootapp.repository.LicensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class LicensesServiceImpl implements LicensesService{
    @Autowired
    private LicensesRepository licensesRepository;

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.of("America/New_York"));


//    @Override
//    public Licenses saveLicense(Licenses licenses) {
//        licenses.setLicenseStart(formatDate(licenses.getLicenseStart()));
//        licenses.setLicenseEnd(formatDate(licenses.getLicenseEnd()));
//        return licensesRepository.save(licenses);
//    }
//
//    public Date formatDate(ZonedDateTime date){
//
//        return dtf.format(date);
//    }

    //seperate formatting function because of code reusability(solid principles java)
}
