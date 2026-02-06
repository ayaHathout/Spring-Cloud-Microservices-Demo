package com.ayahathout.employee_service.services.impls;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import com.ayahathout.employee_service.dtos.EmployeeResponseDTO;
import com.ayahathout.employee_service.models.Employee;
import com.ayahathout.employee_service.repositories.EmployeeRepo;
import com.ayahathout.employee_service.services.interfaces.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${address.service.base.url}")
    private String addressBaseURL;

    @Override
    public EmployeeResponseDTO getEmployeeWithId(Integer id) {
        Employee employee = employeeRepo.findById(id).get();

        EmployeeResponseDTO employeeResponseDTO = modelMapper.map(employee, EmployeeResponseDTO.class);
        AddressResponseDTO addressResponseDTO = restTemplate.getForObject(addressBaseURL + "{id}", AddressResponseDTO.class, id);

        employeeResponseDTO.setAddress(addressResponseDTO);
        return employeeResponseDTO;
    }
}
