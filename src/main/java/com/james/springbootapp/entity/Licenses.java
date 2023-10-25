package com.james.springbootapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity@Table(name = "employee_Licenses")
public class Licenses implements Serializable {
    @Id
    @Column(name="license_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer license_id;
    @Column(name = "license_start_date")
    private LocalDateTime licenseStart;
    @Column(name="license_end_date")
    private LocalDateTime licenseEnd;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    //first thing you have to enter records
    //and then filter the list of employees whose license are expiring in next 15 days
    //Use Path params
}
