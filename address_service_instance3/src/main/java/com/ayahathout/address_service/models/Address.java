package com.ayahathout.address_service.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "addresses")
@Data
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String street;
    String city;
    String country;

    @Column(name = "employee_id")
    Integer employeeId;
}
