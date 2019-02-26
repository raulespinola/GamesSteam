package com.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entities.Customer;
import com.springmvc.entities.User;
import com.springmvc.repositories.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserRepository userService;

	@Autowired
	public void setUserService(UserRepository userService) {
		this.userService = userService;
	}
	
	@RequestMapping({ "/list", "/" })
	public String listUsers(Model model) {
		
		model.addAttribute("users", userService.findAll());
		return "user/list";
	}
	
	@RequestMapping("/show/{id}")
	public String getUser(@PathVariable Long id, Model model) {
		
		userService.findById(id).ifPresent(o -> model.addAttribute("user", o));
		//model.addAttribute("user", userService.findById(id));
		return "user/show"; 
	}
	
	@RequestMapping("/new")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "user/userform";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.findById(id));
		return "user/userform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveOrUpdate(User user) {
		User savedUser = userService.save(user);
		return "redirect:/user/show/" + savedUser.getId();
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		userService.deleteById(id);
		return "redirect:/user/list";
	}
	
	
}
