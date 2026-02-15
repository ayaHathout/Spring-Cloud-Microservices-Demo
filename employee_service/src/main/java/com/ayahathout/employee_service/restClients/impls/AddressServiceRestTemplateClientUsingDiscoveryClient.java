package com.ayahathout.employee_service.restClients.impls;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import com.ayahathout.employee_service.restClients.interfaces.AddressServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Profile("rest-template-discovery-client")
public class AddressServiceRestTemplateClientUsingDiscoveryClient implements AddressServiceClient {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${address.service.name}")
    private String addressServiceNameInEureka;

    @Override
    public AddressResponseDTO getAddress(Integer employeeId) {
        String url = "http://" + addressServiceNameInEureka + "/addresses/{employee-id}";
        System.out.println("Address Service url: " + url);

        return restTemplate.getForObject(url, AddressResponseDTO.class, employeeId);
    }
}
