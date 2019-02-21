package com.springmvc.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="User")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends BaseEntityName {

	@Transient
	private String password;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@OneToOne (cascade= CascadeType.ALL)
	private Customer customer;
	
	@OneToMany
	private Set<UserItem> userItem;
	
	public User() {
	}
	
	public User(String name, String password) {
		super.setName(name);
		this.password = password;
	}	
	
}
