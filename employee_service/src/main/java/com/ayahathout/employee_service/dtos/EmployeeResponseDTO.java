package com.ayahathout.employee_service.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeResponseDTO implements Serializable {
    Integer id;
    String firstName;
    String lastName;
    Integer age;
    AddressResponseDTO address;
}
