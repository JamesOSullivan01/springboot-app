package com.james.springbootapp.service;

import com.james.springbootapp.entity.LicenseDTO;
import com.james.springbootapp.entity.Licenses;

public interface LicensesService {
    Licenses saveLicense(LicenseDTO licenses);
}
