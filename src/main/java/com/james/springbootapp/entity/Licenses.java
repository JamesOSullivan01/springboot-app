package com.james.springbootapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity@Table(name = "employee_Licenses")
public class Licenses implements Serializable {
    @GeneratedValue
    @Id
    @Column(name="license_id")
    private Long license_id;
    @Column(name = "license_start_date")
    private Date licenseStart;
    @Column(name="license_end_date")
    private Date licenseEnd;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
