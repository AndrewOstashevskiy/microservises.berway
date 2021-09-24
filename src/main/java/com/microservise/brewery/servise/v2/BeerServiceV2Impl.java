package com.microservise.brewery.servise.v2;

import com.microservise.brewery.web.model.v2.BeerDtoV2;
import com.microservise.brewery.web.model.v2.BeerStyle;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("v2")
                .beerStyle(BeerStyle.GOSE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("v2 new")
                .beerStyle(BeerStyle.GOSE)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        log.debug("V2 update....");
    }

    @Override
    public void deleteBeer(UUID id) {
        log.debug("V2 delete....");
    }
}
