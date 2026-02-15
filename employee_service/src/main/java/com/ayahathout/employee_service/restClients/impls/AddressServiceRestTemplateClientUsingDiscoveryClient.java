package com.ayahathout.employee_service.restClients.impls;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import com.ayahathout.employee_service.restClients.interfaces.AddressServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${address.service.name}")
    private String addressServiceNameInEureka;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public AddressResponseDTO getAddress(Integer employeeId) {
        List<ServiceInstance> addressServiceAllInstances = discoveryClient.getInstances(addressServiceNameInEureka);

        ServiceInstance addressServiceInstance = addressServiceAllInstances.get(0);

        String addressServiceContextPath = addressServiceInstance.getMetadata().get("context-path");

        String url = "http://" + addressServiceNameInEureka + addressServiceContextPath + "/{employee-id}";
        System.out.println("Address Service url: " + url);

        return restTemplate.getForObject(url, AddressResponseDTO.class, employeeId);
    }
}
