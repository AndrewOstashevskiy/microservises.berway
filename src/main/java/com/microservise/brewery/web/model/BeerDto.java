package com.microservise.brewery.web.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BeerDto {
    UUID id;
    String beerName;
    String beerStyle;
    Long upc;
}
