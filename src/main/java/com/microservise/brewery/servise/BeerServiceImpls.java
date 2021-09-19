package com.microservise.brewery.servise;

import com.microservise.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpls implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("first")
                .beerStyle("light")
                .upc(1233525L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("new")
                .beerStyle("light")
                .upc(5657757L)
                .build();
    }
}
