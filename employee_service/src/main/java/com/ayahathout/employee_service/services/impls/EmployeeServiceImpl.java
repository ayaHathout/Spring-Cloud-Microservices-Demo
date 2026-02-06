package com.ayahathout.employee_service.services.impls;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import com.ayahathout.employee_service.dtos.EmployeeResponseDTO;
import com.ayahathout.employee_service.models.Employee;
import com.ayahathout.employee_service.repositories.EmployeeRepo;
import com.ayahathout.employee_service.restClients.interfaces.AddressServiceClient;
import com.ayahathout.employee_service.services.interfaces.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressServiceClient addressServiceClient;

    @Override
    public EmployeeResponseDTO getEmployeeWithId(Integer id) {
        Employee employee = employeeRepo.findById(id).get();

        EmployeeResponseDTO employeeResponseDTO = modelMapper.map(employee, EmployeeResponseDTO.class);
        AddressResponseDTO addressResponseDTO = addressServiceClient.getAddress(id);

        employeeResponseDTO.setAddress(addressResponseDTO);
        return employeeResponseDTO;
    }
}
