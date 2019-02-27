package com.springmvc.services.jpa;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.*;
import com.springmvc.repositories.UserRepository;
import com.springmvc.services.*;

@Service
@Profile("jpadao")
public class UserServiceJpaDAOImpl implements UserService {


	private UserRepository userRepository;

	public UserServiceJpaDAOImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
		
	@Override
	public List<User> findByName(String name) {
		 return userRepository.findByName(name);
	}
	
	@Override
	public User save(User var1) {
		return userRepository.save(var1);
	}
	
	@Override
	public User findById(Long id) {		
		return userRepository.findById(id).orElse(null);		
	}

	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);		
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}
	
	@Override
	public Set<User> findAll() {
		Set<User> users = new HashSet<>();		
		userRepository.findAll().forEach(users::add);		
		return users;
	}




}
