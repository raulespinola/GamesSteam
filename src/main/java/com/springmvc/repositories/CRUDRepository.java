package com.springmvc.repositories;

import java.util.*;

/*
 * CRUD Service
 */
public interface CRUDRepository<T, ID> {

	long count();
	
	//Read Operations
	T getById(ID id);
	
	Optional<T> findById(ID var1);
	
	boolean existsById(ID var1);
	
	Iterable<T> findAll();
	
	Iterable<T> findAllById(Iterable<ID> var1);
		
    List<T>listAll();
	
	//Create - Update Operations

	T saveOrUpdate(T object);
	
	<S extends T> S save (S var1);
	
	<S extends T> Iterable<S> saveAll (Iterable<S> var1);
	
	
	//Delete Operations
	
	void delete(T object);  
	
	void deleteById(ID id);
	
	void deleteAll(Iterable<? extends T> var1);
	
	void deleteAll();
		
}
