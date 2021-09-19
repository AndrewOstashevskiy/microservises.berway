package com.microservise.brewery.web.controller;

import com.microservise.brewery.servise.BeerService;
import com.microservise.brewery.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
@RequiredArgsConstructor
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(
                beerService.getBeerById(beerId),
                HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody BeerDto beerDto) {
        BeerDto saved = beerService.saveNewBeer(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", saved.getId().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }
}
