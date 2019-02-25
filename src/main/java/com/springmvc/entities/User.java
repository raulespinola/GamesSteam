package com.springmvc.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends BaseEntityName {

	@Transient
	private String password;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@OneToOne (cascade= CascadeType.ALL)
	@Column(name = "customer_id")
	private Customer customer;
	
	@OneToMany (mappedBy="user",fetch=FetchType.LAZY) 
	private Set<UserItem> userItem = new HashSet<>();;
	
	public User() {
	}
	
	public User(String name, String password) {
		super.setName(name);
		this.password = password;
	}	
	
}
