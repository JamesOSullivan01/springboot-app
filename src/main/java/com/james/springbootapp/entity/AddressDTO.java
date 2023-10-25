package com.james.springbootapp.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AddressDTO {
    private Integer address_id;

    private String address;

    private String city;

    private String state;

    private Integer zipcode;

    private Integer employeeId;

}
