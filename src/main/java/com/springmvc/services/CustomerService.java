package com.springmvc.services;

import java.util.List;

import com.springmvc.entities.Customer;


public interface CustomerService extends CRUDService<Customer, Long>{
	
	List<Customer> findByLastName(String lastName);
}
