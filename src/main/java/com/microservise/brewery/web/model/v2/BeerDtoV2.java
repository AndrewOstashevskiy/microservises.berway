package com.microservise.brewery.web.model.v2;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BeerDtoV2 {
    UUID id;
    String beerName;
    BeerStyle beerStyle;
    Long upc;
}
