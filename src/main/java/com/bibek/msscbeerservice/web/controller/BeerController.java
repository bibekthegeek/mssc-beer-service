package com.bibek.msscbeerservice.web.controller;

import com.bibek.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Bibek on 24-12-2022
 */

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        // todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        // todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        // todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
