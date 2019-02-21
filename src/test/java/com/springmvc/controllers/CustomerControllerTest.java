package com.springmvc.controllers;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.springmvc.entities.*;
import com.springmvc.services.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CustomerControllerTest {

	
	@Mock //Mockito Mock object
	private CustomerService customerService;
	
	@InjectMocks //setups up controller, and injects mock objects into it.
	private CustomerController customerController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		
		mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
	}
	
	@Test
	public void testList() throws Exception{
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer());
		customers.add(new Customer());
		
		//specific Mockito interation, tell stub to return list of products
		when(customerService.listAll()).thenReturn((List) customers); //need to strip generics
		mockMvc.perform(get("/customer/list"))
			.andExpect(status().isOk())
			.andExpect(view().name("customer/list"))
			.andExpect(model().attribute("customers", hasSize(2)));
						
		
	}
	
	@Test
	public void testShow() throws Exception{
		Long id=1L;
		when(customerService.getById(id)).thenReturn(new Customer());
		
		mockMvc.perform(get("/customer/show/1"))
			.andExpect(status().isOk())
			.andExpect(view().name("customer/show"))
			.andExpect(model().attribute("customer", instanceOf(Customer.class)));
			
	}
	
	@Test
	public void testNewCustomer() throws Exception{
		verifyZeroInteractions(customerService);
		
		mockMvc.perform(get("/customer/new"))
			.andExpect(status().isOk())
			.andExpect(view().name("customer/customerform"))
			.andExpect(model().attribute("customer", instanceOf(Customer.class)));
	}
	
	@Test
	public void testEdit() throws Exception{
		Long id=1L;
		when(customerService.getById(id)).thenReturn(new Customer());
		
		mockMvc.perform(get("/customer/edit/1"))
			.andExpect(status().isOk())
			.andExpect(view().name("customer/customerform"))
			.andExpect(model().attribute("customer", instanceOf(Customer.class)));
	}
	
	@Test
	public void testSaveOrUpdate() throws Exception {
		Long id=1L;
		String name = "Test Description";
		String lastName = "Hello";
		String phone= "456123";
		
		Customer returnCustomer = new Customer();
		Address billingAddress = new Address();
		returnCustomer.setId(id);
		returnCustomer.setName(name);
		returnCustomer.setLastName(lastName);
		returnCustomer.setPhone(phone);
		
		when(customerService.saveOrUpdate(Mockito.<Customer>any())).thenReturn(returnCustomer);
		
		mockMvc.perform(post("/customer")				
			.param("id","1")
			.param("name", "Test Description")
			.param("lastName","Hello"))				
				.andExpect(status().is3xxRedirection())
				.andExpect(view().name("redirect:/customer/show/1"))
				.andExpect(model().attribute("customer", instanceOf(Customer.class)))
				.andExpect(model().attribute("customer", hasProperty("id", equalTo(id))))
				.andExpect(model().attribute("customer", hasProperty("name", equalTo(name))))
				.andExpect(model().attribute("customer", hasProperty("lastName", equalTo(lastName))));

		
		ArgumentCaptor<Customer> boundCustomer = ArgumentCaptor.forClass(Customer.class);
		verify(customerService).saveOrUpdate(boundCustomer.capture());
		
		assertEquals(id,boundCustomer.getValue().getId());
		assertEquals(name, boundCustomer.getValue().getName());
		assertEquals(lastName, boundCustomer.getValue().getLastName());		
	}
	
	@Test
	public void testDelete() throws Exception{
		Long id=1L;
		mockMvc.perform(get("/customer/delete/1"))
			.andExpect(status().is3xxRedirection())
			.andExpect(view().name("redirect:/customer/list"));
		verify(customerService, times(1)).deleteById(id);
		
	}	
}
