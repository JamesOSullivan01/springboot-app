package com.james.springbootapp.service;

import com.james.springbootapp.entity.LicenseDTO;
import com.james.springbootapp.entity.Licenses;

import java.time.LocalDateTime;
import java.util.List;

public interface LicensesService {
    Licenses saveLicense(LicenseDTO licenses);

    List<Licenses> findLicensesAboutToExpire(LocalDateTime date);
}
