package com.microservise.brewery.servise;

import com.microservise.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID id);

    BeerDto saveNewBeer(BeerDto beerDto);
}
