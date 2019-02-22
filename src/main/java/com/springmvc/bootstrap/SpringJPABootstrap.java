package com.springmvc.bootstrap;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.entities.*;
import com.springmvc.services.*;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;



@Component
public class SpringJPABootstrap {

	private CustomerService customerService;
	private UserService userService;
	
	

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	@EventListener (ContextRefreshedEvent.class)
	public void handleContextStart(ContextRefreshedEvent event) {
		
//		loadCustomer();
//		loadUser();
	}
	
	private void loadUser() {
		User user1= new User();
		user1.setName("Raul");
		user1.setPassword("nuevo");
		user1.setCustomer((Customer)customerService.listAll().get(0));
		userService.saveOrUpdate(user1);
		
		
	}
	
//	private void loadCarts() {
//		List<User> users = (List<User>) userService.listAll();
//		List<Product> products = (List<Product>) productService.listAll();
//		
//		users.forEach(user ->{
//			user.setCart(new Cart());
//			CartDetail cartDetail = new CartDetail();
//			cartDetail.setProduct(products.get(0));
//			cartDetail.setQuantity(2);
//			user.getCart().addCartDetail(cartDetail);
//			userService.saveOrUpdate(user);
//		});
//	}
//	
//	private void loadOrderHistory() {
//		List<User> users = (List<User>) userService.listAll();
//		List<Product> products = (List<Product>) productService.listAll();
//		
//		users.forEach(user ->{
//			Order order = new Order();
//			order.setCustomer(user.getCustomer());
//			order.setOrderstatus(OrderStatus.SHIPPED);
//			
//			products.forEach(product ->{
//				OrderLine orderLine = new OrderLine();
//				orderLine.setProduct(product);
//				orderLine.setQuantity(1);
//				order.addOrderLine(orderLine);						
//			});
//		});
//	}
	
	private void loadCustomer() {
		
		
		Customer customer1 = new Customer();
		Address addressBilling = new Address();
		Address addressPersonal = new Address();
		ZoneOffset zoneOffSet= ZoneOffset.of("+02:00");
		OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffSet);
		
		customer1.setEmail("monchi@gmail.com");
		customer1.setName("Monchito");
		customer1.setLastName("Espi");
		customer1.setPhone("123456");
		customer1.setCreationDate(offsetDateTime);
		customer1.setEditionDate(offsetDateTime);
		customer1.setDeleteDate(offsetDateTime);
		
		addressBilling.setStreet("Java 123");
		addressBilling.setCity("Cordoba");
		addressBilling.setState("AZ");
		addressBilling.setZipCode("5000");
			
		addressPersonal.setStreet("Java 123");
		addressPersonal.setCity("Cordoba");
		addressPersonal.setState("AZ");
		addressPersonal.setZipCode("5000");
			
		customer1.setAddressPersonal(addressPersonal);
		customer1.setAddressBilling(addressBilling);
		
		User user2 = new User();
		user2.setName("Monchix");
		user2.setPassword("HOla");
		
		customer1.setUser(user2);
		
		customerService.saveOrUpdate(customer1);	
		
		
		//Customer 2
		ZoneOffset zoneOffSet1= ZoneOffset.of("+02:00");
		OffsetDateTime offsetDateTime1 = OffsetDateTime.now(zoneOffSet);
		
		Customer customer2 = new Customer();	
		customer2.setEmail("monchi@gmail.com");
		customer2.setName("Raul");
		customer2.setLastName("Espi");
		customer2.setCreationDate(offsetDateTime1);
		customer2.setEditionDate(offsetDateTime1);
		customer2.setDeleteDate(offsetDateTime1);	
		
		Address address1 = new Address();
		address1.setCity("Chaco");
		address1.setCountry("Arg");
		address1.setState("REs");
		address1.setStreet("Avellaneda 190");
		address1.setZipCode("5000");
		
		User user1 = new User();
		user1.setName("Monchix");
		user1.setPassword("HOla");
		
		customer2.setUser(user1);
		customer2.setAddressPersonal(address1);
		
		//add customer to map
		customerService.saveOrUpdate(customer2);	
		
	}

//	public void loadProducts() {
//
//		
//		Product product1 = new Product();
//		product1.setDescription("Product 1");
//		product1.setPrice(new BigDecimal("12.99"));
//		product1.setImageUrl("http://example.com/product1");
//		
//		productService.saveOrUpdate(product1);
//		
//		Product product2 = new Product();
//		product2.setDescription("Product 2");
//		product2.setPrice(new BigDecimal("12.99"));
//		product2.setImageUrl("http://example.com/product2");
//		
//		productService.saveOrUpdate(product2);
//		
//		Product product3 = new Product();
//		product3.setDescription("Product 3");
//		product3.setPrice(new BigDecimal("12.99"));
//		product3.setImageUrl("http://example.com/product3");
//		
//		productService.saveOrUpdate(product3);
//		
//		Product product4 = new Product();
//		product4.setDescription("Product 4");
//		product4.setPrice(new BigDecimal("12.99"));
//		product4.setImageUrl("http://example.com/product4");
//		
//		productService.saveOrUpdate(product4);
//	}

}
