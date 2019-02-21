package com.springmvc.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class Item extends BaseEntityName {

	
	@OneToMany (mappedBy="item",fetch=FetchType.LAZY) 
	private Set<UserItem> userItem;
	
	@OneToOne
	private Description description;
	
	
}
