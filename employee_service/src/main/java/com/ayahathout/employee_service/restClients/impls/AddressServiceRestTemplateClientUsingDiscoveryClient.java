package com.ayahathout.employee_service.restClients.impls;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import com.ayahathout.employee_service.restClients.interfaces.AddressServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Profile("rest-template-discovery-client")
public class AddressServiceRestTemplateClientUsingDiscoveryClient implements AddressServiceClient {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public AddressResponseDTO getAddress(Integer employeeId) {
        // Get the address-service Instances from Eureka server using its name
        List<ServiceInstance> addressServiceInstanceList = discoveryClient.getInstances("address_service");

        // Get the URI of the first instance for address-service
        String addressServiceInstanceURI = addressServiceInstanceList.get(0).getUri().toString();
        System.out.println("Address Service instance URI: " + addressServiceInstanceURI);

        // Get the Context Path of the first instance for address-service

        return restTemplate.getForObject(addressServiceInstanceURI + "/addresses/" + "{employee-id}", AddressResponseDTO.class, employeeId);
    }
}
