package com.springmvc.services;

import java.util.*;

/*
 * CRUD Service
 */
public interface CRUDService<T, ID> {

    List<T>listAll();
	
	T getById(ID id);

	T saveOrUpdate(T object);
	
	void delete(T object);  
	
	void deleteById(ID id);
		
}
