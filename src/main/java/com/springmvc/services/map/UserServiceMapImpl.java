package com.springmvc.services.map;

import java.util.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springmvc.entities.BaseEntityName;
import com.springmvc.entities.User;
import com.springmvc.repositories.UserRepository;

@Service
@Profile("map")
public class UserServiceMapImpl extends AbstractMapService<User, Long> implements UserRepository {

		
		
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

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<User> findById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll(Iterable<? extends User> var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<User> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	


	
	
}
