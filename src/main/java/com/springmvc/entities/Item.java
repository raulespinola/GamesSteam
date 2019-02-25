package com.springmvc.entities;

import java.util.*;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item extends BaseEntityName {

	
	@OneToMany (mappedBy="item",fetch=FetchType.LAZY) 
	private Set<UserItem> userItem = new HashSet<>();
	
	@OneToOne
	@Column(name="desc_id")
	private Description description;
	
	
}
