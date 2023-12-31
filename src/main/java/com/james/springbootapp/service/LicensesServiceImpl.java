package com.james.springbootapp.service;

import com.james.springbootapp.entity.Employee;
import com.james.springbootapp.entity.LicenseDTO;
import com.james.springbootapp.entity.Licenses;
import com.james.springbootapp.repository.LicensesRepository;
import com.james.springbootapp.repository.MyEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LicensesServiceImpl implements LicensesService{
    @Autowired
    private LicensesRepository licensesRepository;

    @Autowired
    private MyEmployeeRepository myEmployeeRepository;

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.of("America/New_York"));



@Override
public Licenses saveLicense(LicenseDTO licenses) {
    System.out.println("======" + licenses.getEmployeeId());
    Licenses entity = new Licenses();

    Employee employee = myEmployeeRepository.getById(Long.valueOf(licenses.getEmployeeId()));
    System.out.println("===============" + "================" + employee.getFirstName());

    LocalDateTime licenseStartDate = formatDate(licenses.getLicenseStart());
    LocalDateTime licenseEndDate = formatDate(licenses.getLicenseEnd());

    entity.setLicenseStart(licenseStartDate);
    entity.setLicenseEnd(licenseEndDate);
    entity.setEmployee(employee);

    return licensesRepository.save(entity);
}

    @Override
    public List<Licenses> findLicensesAboutToExpire(LocalDateTime date) {
            List<Licenses> expiringLicenses = licensesRepository.findAll();

        List<Licenses> filteredLicenses = expiringLicenses.stream()
                .filter(license -> license.getLicenseEnd().isBefore(date))
                .collect(Collectors.toList());


        return filteredLicenses;
    }

    public LocalDateTime formatDate(String dateString){
        return LocalDateTime.parse(dateString, dtf);
    }




    //seperate formatting function because of code reusability(solid principles java)

    //**HW FOR 10/23/2023save address with employee entity
    // Understand @transactional better
}
