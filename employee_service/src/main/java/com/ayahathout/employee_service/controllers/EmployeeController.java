package com.ayahathout.employee_service.controllers;

import com.ayahathout.employee_service.dtos.EmployeeResponseDTO;
import com.ayahathout.employee_service.services.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> getEmployeeById(@PathVariable Integer id) {
        EmployeeResponseDTO res = employeeService.getEmployeeWithId(id);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
