package com.ayahathout.address_service.controllers;

import com.ayahathout.address_service.dtos.AddressResponseDTO;
import com.ayahathout.address_service.services.interfaces.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("{employeeId}")
    public ResponseEntity<AddressResponseDTO> getAddress(@PathVariable Integer employeeId) {
        AddressResponseDTO responseDTO = addressService.findByEmplyeeId(employeeId);
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }
}
