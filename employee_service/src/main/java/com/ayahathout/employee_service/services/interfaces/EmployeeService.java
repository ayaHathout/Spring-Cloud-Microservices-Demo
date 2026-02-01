package com.ayahathout.employee_service.services.interfaces;

import com.ayahathout.employee_service.dtos.EmployeeResponseDTO;

public interface EmployeeService {
    EmployeeResponseDTO getEmployeeWithId(Integer id);
}
