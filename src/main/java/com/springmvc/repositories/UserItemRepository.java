package com.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springmvc.entities.UserItem;

public interface UserItemRepository extends CrudRepository<UserItem, Long> {
	
}
