package com.ayahathout.employee_service.restClients.impls;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import com.ayahathout.employee_service.restClients.interfaces.AddressServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Profile("rest-template")
public class AddressServiceRestTemplateClient implements AddressServiceClient {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${address.service.base.url}")
    private String addressBaseURL;

    @Override
    public AddressResponseDTO getAddress(Integer employeeId) {
        return restTemplate.getForObject(addressBaseURL + "{employee-id}", AddressResponseDTO.class, employeeId);
    }
}
