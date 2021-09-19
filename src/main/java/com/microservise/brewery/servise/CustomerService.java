package com.microservise.brewery.servise;

import com.microservise.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
