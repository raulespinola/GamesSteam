package com.springmvc.services.map;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springmvc.entities.BaseEntity;



@Service
public abstract class AbstractMapService <T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> entityMap;
	
	AbstractMapService() {
		entityMap = new HashMap<>();
	}
		
	 T getById(ID id) {
		return entityMap.get(id);
	}
	
	void deleteById(ID id) {
		entityMap.remove(id);
	}
	
	void delete(T object) {
		entityMap.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	T saveOrUpdate(T object) {
		if (object != null) {
			if (object.getId() == null)
			{
				object.setId(getNextId());				
			}			
			entityMap.put(object.getId(), object);
		} else {
			throw new RuntimeException("No Object");
		}		
		return object;
	}
	
	private Long getNextId() {
		Long nextId = null;
		try {
			nextId = Collections.max(entityMap.keySet())+1;
		} catch (NoSuchElementException ex) {
			nextId = 1L;
		}
		
		return  nextId;
	}
	
	public List<T> listAll() {
		return new ArrayList<>(entityMap.values());
	}
	
	public Set<T> findAll() {
		return new HashSet<>(entityMap.values());
	}
	


}
