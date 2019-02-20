package com.springmvc.services.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springmvc.entities.*;

@Service
public abstract class AbstractMapService {

	protected Map<Long, BaseEntityName> entityMap;
	
	public AbstractMapService() {
		entityMap = new HashMap<>();
	}
		
	public BaseEntityName getById(Long id) {
		return entityMap.get(id);
	}
	
	public void delete(Long id) {
		entityMap.remove(id);
	}
	
	public BaseEntityName saveOrUpdate(BaseEntityName entityObject) {
		
		if (entityObject != null) {
			if(entityObject.getId()==null) {
				entityObject.setId(getNextKey());
			}
			entityMap.put(entityObject.getId(),entityObject);
			return entityObject;
		} else {
			throw new RuntimeException("Object cant be null");
		}		
	}
	
	private Long getNextKey() {
		return (long) (Collections.max(entityMap.keySet())+1);
	}
	
	public List<BaseEntityName> listAll() {
		return new ArrayList<>(entityMap.values());
	}
	


}
