package com.springmvc.services.jpa;

import com.springmvc.entities.*;
import com.springmvc.repositories.UserRepository;
import com.springmvc.services.*;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("jpadao")
public class UserServiceJpaDAOImplTest {

	private UserRepository userService;
//	private ProductService productService;
	
	@Autowired
	public void setUserService(UserRepository userService) {
		this.userService = userService;
	}
	
//	
//	@Autowired
//	public void setProductService(ProductService productService) {
//		this.productService = productService;
//	}
//


	@Test
	public void testSaveOfUser() throws Exception {
		User user= new User();
		
		user.setName("someusername");
		user.setPassword("myPassword");
		
		User savedUser = userService.save(user);
		
		assert savedUser.getId() != null;
//		assert savedUser.getEncryptedPassword() != null;
		
		System.out.println("Encrypted Password");
//		System.out.print(savedUser.getEncryptedPassword());
	}
	
//	@Test
//	public void testSaveOfUserWithCustomer() throws Exception {
//		
//		
//		User user= new User();
//		user.setUsername("someusername");
//		user.setPassword("myPassword");
//		
//		Customer customer = new Customer();
//		customer.setFirstname("Monchi");
//		user.setCustomer(customer);
//		
//		User savedUser = userService.saveOrUpdate(user);
//		
//		assert  savedUser.getId() != null;
//		assert  savedUser.getCustomer().getFirstname()!= null;
//		assert savedUser.getCustomer().getUser() != null;
//		
//	}
	
//	@Test
//	public void testAddCartToUser() throws Exception {
//		
//		
//		User user= new User();
//		user.setUsername("someusername");
//		user.setPassword("myPassword");
//		
//		user.setCart(new Cart());
//		
//		User savedUser = userService.saveOrUpdate(user);
//		
//		assert savedUser.getId() != null;
//		assert savedUser.getVersion() != null;
//		assert savedUser.getCart() != null;
//		assert savedUser.getCart().getId() != null;
//	}
	
//	@Test
//	public void testAddCartToUserWithCartDetails() throws Exception {
//		
//		
//		User user= new User();
//		user.setUsername("someusername");
//		user.setPassword("myPassword");
//		
//		Cart cart = new Cart();
//		user.setCart(cart);
//		
//		//Bootstrap Products
//		List<Product> storedProducts = (List<Product>) productService.listAll();
//		
//		CartDetail cartItemOne = new CartDetail();
//		cartItemOne.setProduct(storedProducts.get(0));
//		user.getCart().addCartDetail(cartItemOne);
//		
//		CartDetail cartItemTwo = new CartDetail();
//		cartItemTwo.setProduct(storedProducts.get(1));
//		user.getCart().addCartDetail(cartItemTwo);
//		
//		
//		User savedUser = userService.saveOrUpdate(user);
//		
//		Integer sizeCart = savedUser.getCart().getCartDetails().size();
//		
//		assert savedUser.getId() != null;
//		assert savedUser.getVersion() != null;
//		assert savedUser.getCart() != null;
//		assert savedUser.getCart().getId() != null;
//		assert sizeCart == 2;
//		
//		savedUser.getCart().removeCartDetail(savedUser.getCart().getCartDetails().get(1));
//		savedUser = userService.saveOrUpdate(savedUser);		
//		sizeCart = savedUser.getCart().getCartDetails().size();
//		
//		assert sizeCart == 1;
//	
//	}
	
//	@Test
//	public void testAddCartToUserWithCartDetailsAndProduct() throws Exception {
//		
//		
//		User user= new User();
//		user.setUsername("someusername");
//		user.setPassword("myPassword");
//		
//		Cart cart = new Cart();
//		user.setCart(cart);
//		
//		CartDetail cartDetail = new CartDetail();
//		cart.addCartDetail(cartDetail);
//		
//		Product product = new Product();
//		product.setDescription("auto");
//		
//		cartDetail.setProduct(product);
//		
//		User savedUser = userService.saveOrUpdate(user);
//		
//		assert savedUser.getId() != null;
//		assert savedUser.getVersion() != null;
//		assert savedUser.getCart() != null;
//		assert savedUser.getCart().getId() != null;
//		assert savedUser.getCart().getCartDetails().get(0) !=null;
//		assert savedUser.getCart().getCartDetails().get(0).getProduct().getId()!=null;
//		
//		System.out.println(savedUser.getCart().getCartDetails().get(0).getProduct().getDescription());
//	}
}
