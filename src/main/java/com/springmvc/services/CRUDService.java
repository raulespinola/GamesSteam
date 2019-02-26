package com.springmvc.services;


import java.util.*;

import org.springframework.data.repository.Repository;


/*
 * CRUD Service
 */
public interface CRUDService<T, ID> {

	Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
		
}
