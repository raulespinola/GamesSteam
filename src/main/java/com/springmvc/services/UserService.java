package com.springmvc.services;


import java.util.List;
import java.util.Optional;

import com.springmvc.entities.*;


public interface UserService extends CRUDService<User, Long>{
	List<User> findByName(String name);
}
