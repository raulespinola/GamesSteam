package com.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entities.Customer;
import com.springmvc.entities.User;
import com.springmvc.repositories.CustomerRepository;
import com.springmvc.repositories.UserRepository;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	public void setCustomerService(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}
	
	@RequestMapping({ "/list", "/" })
	public String listCustomers(Model model) {
		
		model.addAttribute("customers", customerRepository.findAll());
		return "customer/list";
	}
	
	@RequestMapping("/show/{id}")
	public String getCustomer(@PathVariable Long id, Model model) {
		
		customerRepository.findById(id).ifPresent(o -> model.addAttribute("customer", o));
		return "customer/show";
	}
	
	@RequestMapping("/new")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("users", userRepository.findAll());
		return "customer/customerform";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("customer",customerRepository.findById(id));
		return "customer/customerform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String save(Customer customer) {
		Customer savedCustomer =customerRepository.save(customer);
		return "redirect:/customer/show/" + savedCustomer.getId();
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		customerRepository.deleteById(id);
		return "redirect:/customer/list";
	}
	
	
	
}
