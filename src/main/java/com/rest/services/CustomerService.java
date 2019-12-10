package com.rest.services;

import org.springframework.stereotype.Service;

import com.rest.Dtos.CustomerDto;
import com.rest.utils.InmemoryDatabase;

@Service
public class CustomerService {
	
	public CustomerDto savedata(Integer  cdto) {
		return InmemoryDatabase.bankcustomer.get(cdto);
		
	}

}
