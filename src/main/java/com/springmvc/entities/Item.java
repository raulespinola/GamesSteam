package com.springmvc.entities;

import java.util.Set;

import javax.persistence.*;

public abstract class Item extends BaseEntityName {

	
	@OneToMany
	private Set<UserItem> userItem;
	
	@OneToOne
	private Description description;
	
	
}
