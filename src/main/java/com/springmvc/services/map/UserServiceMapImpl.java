package com.springmvc.services.map;

import java.util.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.BaseEntityName;
import com.springmvc.entities.User;
import com.springmvc.services.UserService;

@Service
@Profile("map")
public class UserServiceMapImpl extends AbstractMapService implements UserService {

	
	
		
	public UserServiceMapImpl() {
		loadUsers();
	}

	private void loadUsers() {
		entityMap = new HashMap();			
		User user1 = new User("monchito", "1234");
		user1.setId((long) 1);		
		entityMap.put((long) 1, user1);		
	}


//	@Override
//	public List<User> listAll() {
//		// TODO Auto-generated method stub
//		return super.listAll();
//	}

	@Override
	public User getById(Long id) {
		return (User) super.getById(id);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}
	
	@Override
	public User saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		return (User) super.saveOrUpdate((User) user);
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}



	
	
}
