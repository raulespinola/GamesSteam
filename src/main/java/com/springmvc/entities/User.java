package com.springmvc.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User extends BaseEntityName {

	@Transient
	private String password;
	
	@OneToOne (cascade= CascadeType.ALL)
	private Customer customer;
	
	@ManyToMany
	@JoinTable(name ="UserItem2",
			joinColumns =@JoinColumn(name = "userId"), 
				inverseJoinColumns = @JoinColumn(name = "itemId"))
	private Set<UserItem> userItem;
	
	public User() {
	}
	
	public User(String name, String password) {
		super.setName(name);
		this.password = password;
	}	
	
}
