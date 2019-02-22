package com.springmvc.repositories;


import java.util.Optional;

import com.springmvc.entities.*;


public interface UserRepository extends CRUDRepository<User, Long>{
	Optional<User> findByName(String name);
}
