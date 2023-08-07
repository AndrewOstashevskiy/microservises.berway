package com.microservise.brewery.servise;

import com.microservise.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpls implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder()
                .id(id)
                .beerName("first")
                .beerStyle("light")
                .upc(1233525L)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beer) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("new")
                .beerStyle("light")
                .upc(5657757L)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Updating beer....");
    }

    @Override
    public void deleteBeer(UUID id) {
        log.debug("Deleting beer....");
    }
}
