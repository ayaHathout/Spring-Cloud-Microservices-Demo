package com.ayahathout.address_service.repositories;

import com.ayahathout.address_service.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
    Address findByEmployeeId(Integer employeeId);
}
