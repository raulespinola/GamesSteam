package com.springmvc.entities;


import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Useritem")
public class UserItem {

	@EmbeddedId
	private CompositeId compositeId;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Item item;
}
