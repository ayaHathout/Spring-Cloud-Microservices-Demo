package com.ayahathout.address_service.services.interfaces;

import com.ayahathout.address_service.dtos.AddressResponseDTO;

public interface AddressService {
    AddressResponseDTO findByEmplyeeId(Integer employeeId);
}
