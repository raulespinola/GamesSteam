package com.springmvc.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.entities.Customer;


@Service
public interface CustomerService extends CRUDService<Customer, Long>{
	List<Customer> findByLastName(String lastName);
}
