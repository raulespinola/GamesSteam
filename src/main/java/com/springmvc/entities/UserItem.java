package com.springmvc.entities;


import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Useritems")
public class UserItem {

	@EmbeddedId
	private ItemUserId itemUserId;
	
	@ManyToOne
	@Column(name ="user_id")
	private User user;
	
	@ManyToOne
	@Column(name ="item_id")
	private Item item;
}
