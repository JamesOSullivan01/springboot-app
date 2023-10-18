package com.james.springbootapp.DTO;

import com.james.springbootapp.entity.Licenses;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
@Getter
@Setter
public class LicensesDTO {
    private Long license_id;
    private String licenseStart;
    private String licenseEnd;

    public static LicensesDTO fromLicenses(Licenses licenses) {
        LicensesDTO dto = new LicensesDTO();
        dto.setLicense_id(licenses.getLicense_id());

        // Format date fields to EST
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        dto.setLicenseStart(sdf.format(licenses.getLicenseStart()));
        dto.setLicenseEnd(sdf.format(licenses.getLicenseEnd()));

        return dto;
    }
}
