package com.ayahathout.employee_service.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressResponseDTO implements Serializable {
    String street;
    String city;
    String country;
}
