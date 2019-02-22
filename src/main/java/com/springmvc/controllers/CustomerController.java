package com.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entities.Customer;
import com.springmvc.repositories.CustomerRepository;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private CustomerRepository customerService;

	@Autowired
	public void setCustomerService(CustomerRepository customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping({ "/list", "/" })
	public String listCustomers(Model model) {
		
		model.addAttribute("customers", customerService.listAll());
		return "customer/list";
	}
	
	@RequestMapping("/show/{id}")
	public String getCustomer(@PathVariable Long id, Model model) {
		model.addAttribute("customer", customerService.getById(id));
		return "customer/show";
	}
	
	@RequestMapping("/new")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer/customerform";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("customer", customerService.getById(id));
		return "customer/customerform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveOrUpdate(Customer customer) {
		Customer savedCustomer = customerService.saveOrUpdate(customer);
		return "redirect:/customer/show/" + savedCustomer.getId();
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		customerService.deleteById(id);
		return "redirect:/customer/list";
	}
	
	
}
