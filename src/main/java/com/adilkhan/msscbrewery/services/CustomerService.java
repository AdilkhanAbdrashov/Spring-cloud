package com.adilkhan.msscbrewery.services;

import com.adilkhan.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
