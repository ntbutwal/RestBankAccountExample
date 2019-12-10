package com.rest.utils;

import java.util.HashMap;
import java.util.Map;

import com.rest.Dtos.CustomerDto;

public class InmemoryDatabase {
	
	public static Map<Integer, CustomerDto> bankcustomer;
	
	static {
		bankcustomer= new HashMap<Integer, CustomerDto>();
		
	CustomerDto cd= new CustomerDto();
	cd.setAccpountno(12345);
	cd.setAddress("3025 Virginia dare Ct");
	cd.setEmail("ntbutwal@gmail.com");
	cd.setIntitialAmount(7236.22);
	cd.setName("Kishor Kunwar");
	cd.setRoutingno(63248);
	bankcustomer.put(12345, cd);
	
	CustomerDto cd1= new CustomerDto();
	cd1.setAccpountno(67890);
	cd1.setAddress("1122 Whitworth Ct");
	cd1.setEmail("jay.joshi@gmail.com");
	cd1.setIntitialAmount(348673.22);
	cd1.setName("Jay Joshi");
	cd1.setRoutingno(38294);
	bankcustomer.put(67890, cd1);
	
	CustomerDto cd2= new CustomerDto();
	cd2.setAccpountno(24680);
	cd2.setAddress("7608 Savannah St");
	cd2.setEmail("roshan.bhai@gmail.com");
	cd2.setIntitialAmount(3875.22);
	cd2.setName("Roshan Ramtel");
	cd2.setRoutingno(78375);
	bankcustomer.put(24680, cd2);
	}
}
