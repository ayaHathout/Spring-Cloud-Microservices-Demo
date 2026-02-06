package com.ayahathout.employee_service.restClients.interfaces;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;

public interface AddressServiceClient {
    AddressResponseDTO getAddress(Integer employeeId);
}
