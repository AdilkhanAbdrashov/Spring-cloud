package com.adilkhan.msscbrewery.services;

import com.adilkhan.msscbrewery.web.model.BeerDto;


import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
     BeerDto getBeerById(UUID beerId);

     BeerDto saveNewBeer(BeerDto beerDto);

     void deleteById(UUID beerId);
}
