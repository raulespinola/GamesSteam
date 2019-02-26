package com.springmvc.repositories;

import java.util.List;

import com.springmvc.entities.Customer;

import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	List<Customer> findByLastName(String lastName);
}
