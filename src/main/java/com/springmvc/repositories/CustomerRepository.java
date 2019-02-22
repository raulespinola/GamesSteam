package com.springmvc.repositories;

import java.util.List;

import com.springmvc.entities.Customer;


public interface CustomerRepository extends CRUDRepository<Customer, Long>{
	
	List<Customer> findByLastName(String lastName);
}
