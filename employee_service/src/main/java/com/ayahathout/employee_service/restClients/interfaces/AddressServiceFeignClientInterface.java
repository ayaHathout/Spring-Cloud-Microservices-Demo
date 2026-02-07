package com.ayahathout.employee_service.restClients.interfaces;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "addressClient", url = "${address.service.base.url}")
public interface AddressServiceFeignClientInterface {
    @GetMapping("{employeeId}")
    ResponseEntity<AddressResponseDTO> getAddress(@PathVariable Integer employeeId);
}
