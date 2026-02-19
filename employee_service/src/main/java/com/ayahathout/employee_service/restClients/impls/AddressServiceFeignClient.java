package com.ayahathout.employee_service.restClients.impls;

import com.ayahathout.employee_service.dtos.AddressResponseDTO;
import com.ayahathout.employee_service.restClients.interfaces.AddressServiceClient;
import com.ayahathout.employee_service.restClients.interfaces.AddressServiceFeignClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("open-feign")
@RefreshScope
public class AddressServiceFeignClient implements AddressServiceClient {
    @Autowired
    private AddressServiceFeignClientInterface addressServiceFeignClientInterface;

    @Override
    public AddressResponseDTO getAddress(Integer employeeId) {
        return addressServiceFeignClientInterface.getAddress(employeeId).getBody();
    }
}
