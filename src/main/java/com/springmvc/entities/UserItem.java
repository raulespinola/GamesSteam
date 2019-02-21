package com.springmvc.entities;


import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Useritem")
public class UserItem {

	@EmbeddedId
	private UserItemId userItemId;
	
	@OneToOne
	private User user;
	
	@OneToOne
	private Item item;
}
