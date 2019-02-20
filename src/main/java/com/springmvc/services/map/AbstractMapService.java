package com.springmvc.services.map;

import java.util.*;

import org.springframework.stereotype.Service;



@Service
public abstract class AbstractMapService <T, ID> {

	protected Map<ID, T> entityMap;
	
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
	
	T saveOrUpdate(ID id, T object) {
		
		entityMap.put(id, object);
		return object;
		
	}
	
//	private Long getNextKey() {
//		return (Long) (Collections.max(entityMap.keySet())+1);
//	}
	
	public List<T> listAll() {
		return new ArrayList<>(entityMap.values());
	}
	
	public Set<T> findAll() {
		return new HashSet<>(entityMap.values());
	}
	


}
