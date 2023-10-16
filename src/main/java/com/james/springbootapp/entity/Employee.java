package com.james.springbootapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private Integer employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private Character gender;
    @Column(name = "salary")
    private String salary;
    @Column(name = "username")
    private String username;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)

   private List<Address> addressList = new ArrayList<>();

    //fetch and eager


}
