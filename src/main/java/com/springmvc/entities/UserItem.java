package com.springmvc.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table
public class UserItem {

	private Long userId;
	private Long gameId;
	
	@OneToOne()
	private User user;
	
	@OneToOne()
	private Item item;
	
}
