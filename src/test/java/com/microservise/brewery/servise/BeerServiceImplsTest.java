package com.microservise.brewery.servise;

import static org.junit.jupiter.api.Assertions.*;

import com.microservise.brewery.web.model.BeerDto;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BeerServiceImplsTest {

  @InjectMocks
  private BeerServiceImpls beerServiceImpl;

  @Test
  void getBeerById() {
    UUID id = UUID.randomUUID();
    BeerDto beerById = beerServiceImpl.getBeerById(id);
    Assertions.assertEquals(
        BeerDto.builder()
            .id(UUID.randomUUID())
            .beerName("first")
            .beerStyle("light")
            .upc(1233525L)
            .build(), beerById
    );
  }
}