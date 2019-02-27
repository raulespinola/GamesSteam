package com.springmvc.repositories;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springmvc.entities.*;


public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findByName(String name);
}
