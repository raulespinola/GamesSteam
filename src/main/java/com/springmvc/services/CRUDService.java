package com.springmvc.services;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.springmvc.entities.*;

public interface CRUDService<T> {

    List<?>listAll();
	
	T getById(Long id);

	T saveOrUpdate(T BaseEntity);
	
	void delete(Long id);  
}
