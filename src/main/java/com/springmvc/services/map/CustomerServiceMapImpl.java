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
import com.springmvc.services.*;


@Service
@Profile("map")
public class CustomerServiceMapImpl extends AbstractMapService implements CustomerService{

	
	
	public CustomerServiceMapImpl() {
		entityMap  = new HashMap<>();
		loadCustomers();
	}
	
	@Override
	public List<BaseEntityName> listAll() {
			return super.listAll();
	}	
	
	
	@Override
	public Customer getById(Long id) {
		return (Customer) super.getById(id);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}
	
	@Override
	public Customer saveOrUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return (Customer) super.saveOrUpdate((Customer) customer);
	}



	private void loadCustomers() {
		
		//Initialize map
		entityMap  = new HashMap<>();
		
		ZoneOffset zoneOffSet= ZoneOffset.of("+02:00");
		OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffSet);
		
		Customer customer1 = new Customer();	
		customer1.setEmail("monchi@gmail.com");
		customer1.setName("Raul");
		customer1.setLastName("Espi");
		customer1.setCreationDate(offsetDateTime);
		customer1.setEditionDate(offsetDateTime);
		customer1.setDeleteDate(offsetDateTime);	
		customer1.setId((long) 1);
		
		Address address1 = new Address();
		address1.setCity("Chaco");
		address1.setCountry("Arg");
		address1.setState("REs");
		address1.setStreet("Avellaneda 190");
		address1.setZipCode("5000");
		
		User user1 = new User();
		user1.setName("Monchix");
		user1.setPassword("HOla");
		
		customer1.setUser(user1);
		customer1.setAddressBilling(address1);
		
		//add customer to map
		entityMap.put((long) 1, customer1);
		
		
	}



}
