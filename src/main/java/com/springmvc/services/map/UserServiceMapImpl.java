package com.springmvc.services.map;

import java.util.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.BaseEntityName;
import com.springmvc.entities.User;
import com.springmvc.services.UserService;

@Service
@Profile("map")
public class UserServiceMapImpl extends AbstractMapService<User, Long> implements UserService {

		
		
	public UserServiceMapImpl() {
		entityMap  = new HashMap<>();
		
	}
	
	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return super.listAll();
	}

	@Override
	public User getById(Long id) {
		return (User) super.getById(id);
		
	}

	@Override
	public void deleteById(Long id) {

		super.deleteById(id);
	}
	
	@Override
	public User saveOrUpdate(User user) {

		return super.saveOrUpdate(user);
	}

	@Override
	public void delete(User object) {

		
	}

	


	
	
}
