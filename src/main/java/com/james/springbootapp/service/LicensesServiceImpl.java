package com.james.springbootapp.service;

import com.james.springbootapp.entity.Licenses;
import com.james.springbootapp.repository.LicensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicensesServiceImpl implements LicensesService{
    @Autowired
    private LicensesRepository licensesRepository;
    @Override
    public Licenses saveLicense(Licenses licenses) {
        return licensesRepository.save(licenses);
    }
}
