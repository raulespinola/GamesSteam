package com.springmvc.services.jpa;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.*;
import com.springmvc.repositories.CustomerRepository;
import com.springmvc.services.*;

@Service
@Profile("jpadao")
public class CustomerServiceJpaDAOImpl implements CustomerService{

	
	//private EncryptionService encryptionService;

//	@Autowired
//	private void setEncryptionService(EncryptionService encryptionService) {
//		this.encryptionService = encryptionService;
//	}
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceJpaDAOImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findByLastName(String lastName) {
		return customerRepository.findByLastName(lastName);
	}
	
	@Override
	public Set<Customer> findAll() {		
		Set<Customer> customers = new HashSet<>();		
		customerRepository.findAll().forEach(customers::add);		
		return customers;
	}
	
	@Override
	public Customer findById(Long var1) {				
		 return  customerRepository.findById(var1).orElse(null);	
	}
	
	@Override
	public Customer save(Customer var1) {
		return customerRepository.save(var1);
	}
	
	@Override
	public void delete(Customer customer) {
		customerRepository.delete(customer);		
	}
	
	@Override
	public void deleteById(Long id) {	
		customerRepository.deleteById(id);		
	}		
}
