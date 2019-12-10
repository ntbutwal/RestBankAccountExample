package com.rest.controllers;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.Dtos.CustomerDto;
import com.rest.services.CustomerService;

@Controller
@RestController
@RequestMapping("/bank")
public class CustomerController {

	@Autowired
	private CustomerService cusserv;

	public CustomerService getCusserv() {
		return cusserv;
	}

	public void setCusserv(CustomerService cusserv) {
		this.cusserv = cusserv;
	}

	@GetMapping(value = "/{no}/details")
	public CustomerDto displayDataFromDatabase(@PathVariable(value = "no") Integer customer) {
		return cusserv.savedata(customer);

	}
	
	@RequestMapping(value="/{noo}/data" , method = RequestMethod.GET)
	public CustomerDto dispalyDataFromDatanbases(@PathVariable(value="noo") Integer cus,
			@RequestParam String name, @RequestParam int routingno) {
		return cusserv.savedata(cus);
	}
	
	@PostMapping
	public void saveDatainDatabase(@RequestBody CustomerDto cdto) {
		System.out.println(cdto.toString());
	}
	
	@PutMapping
	public void saveUpdateDatabase(@RequestBody CustomerDto cdtos) {
		System.out.println(cdtos.toString());
		
	}

}
