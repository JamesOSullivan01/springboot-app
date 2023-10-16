package com.james.springbootapp.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer address_id;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private Integer zipcode;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


}
