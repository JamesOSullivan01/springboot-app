package com.james.springbootapp.entity;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class LicenseDTO {
    private Integer license_id;
    private String licenseStart;
    private String licenseEnd;

    private Integer employeeId;
}
