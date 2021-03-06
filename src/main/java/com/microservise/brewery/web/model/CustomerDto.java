package com.microservise.brewery.web.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class CustomerDto {
    UUID id;
    String name;
}
