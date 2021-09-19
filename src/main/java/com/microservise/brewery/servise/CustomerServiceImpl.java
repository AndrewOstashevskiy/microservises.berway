package com.microservise.brewery.servise;

import com.microservise.brewery.web.model.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("cust1")
                .build();
    }
}
