package com.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entities.Customer;
import com.springmvc.entities.User;
import com.springmvc.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping({ "/list", "/" })
	public String listUsers(Model model) {
		
		model.addAttribute("users", userService.listAll());
		return "user/list";
	}
	
	@RequestMapping("/show/{id}")
	public String getUser(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "user/show";
	}
	
	@RequestMapping("/new")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "user/userform";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getById(id));
		return "user/userform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveOrUpdate(User user) {
		User savedUser = userService.saveOrUpdate(user);
		return "redirect:/user/show/" + savedUser.getId();
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		userService.delete(id);
		return "redirect:/user/list";
	}
	
	
}
