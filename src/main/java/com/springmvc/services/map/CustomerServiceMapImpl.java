package com.springmvc.services.map;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.Address;
import com.springmvc.entities.BaseEntityName;
import com.springmvc.entities.Customer;
import com.springmvc.entities.User;
import com.springmvc.repositories.CustomerRepository;
import com.springmvc.services.*;


@Service
@Profile("map")
public class CustomerServiceMapImpl {
//extends AbstractMapService<Customer, Long> implements CustomerService{

//	
//	
//	public CustomerServiceMapImpl() {
//		entityMap  = new HashMap<>();
//		loadCustomers();
//	}
//	
//	@Override
//	public List<Customer> listAll() {
//			
//		return super.listAll();
//	}	
//	
//	
//	@Override
//	public Customer getById(Long id) {
//		return super.getById(id);
//		
//	}
//
//	@Override
//	public void deleteById(Long id) {
//		// TODO Auto-generated method stub
//		super.deleteById(id);
//	}
//	
//	@Override
//	public Customer saveOrUpdate(Customer customer) {
//		return super.saveOrUpdate(customer);
//	}
//
//
//
//	private void loadCustomers() {
//		
//		//Initialize map
//		entityMap  = new HashMap<>();
//		
//		ZoneOffset zoneOffSet= ZoneOffset.of("+02:00");
//		OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffSet);
//		
//		Customer customer1 = new Customer();	
//		customer1.setEmail("monchi@gmail.com");
//		customer1.setName("Raul");
//		customer1.setLastName("Espi");
//		customer1.setCreationDate(offsetDateTime);
//		customer1.setEditionDate(offsetDateTime);
//		customer1.setDeleteDate(offsetDateTime);	
//		customer1.setId((long) 1);
//		
//		Address address1 = new Address();
//		address1.setCity("Chaco");
//		address1.setCountry("Arg");
//		address1.setState("REs");
//		address1.setStreet("Avellaneda 190");
//		address1.setZipCode("5000");
//		
//		User user1 = new User();
//		user1.setName("Monchix");
//		user1.setPassword("HOla");
//		
//		customer1.setUser(user1);
//		customer1.setAddressBilling(address1);
//		
//		//add customer to map
//		entityMap.put((long) 1, customer1);
//		
//		
//	}
//
//	@Override
//	public void delete(Customer object) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Customer> findByLastName(String lastName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public Optional<Customer> findById(Long var1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean existsById(Long var1) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterable<Customer> findAllById(Iterable<Long> var1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> S save(S var1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends Customer> Iterable<S> saveAll(Iterable<S> var1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteAll(Iterable<? extends Customer> var1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public Customer findById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer save(Customer object) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	

	



}
