package com.microservise.brewery.servise;

import com.microservise.brewery.web.model.CustomerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;
import java.util.UUID;

@Slf4j
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

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("customer")
                .build();
    }

    @Override
    public void updateCustomerData(UUID id, CustomerDto customerDto) {
        log.debug("Updated customer....");
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.debug("Deleted customer....");
    }
}
