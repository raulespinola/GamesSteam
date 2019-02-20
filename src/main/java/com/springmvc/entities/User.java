package com.springmvc.entities;

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
	
	
	public User() {
	}
	
	public User(String name, String password) {
		super.setName(name);
		this.password = password;
	}	
	
}
