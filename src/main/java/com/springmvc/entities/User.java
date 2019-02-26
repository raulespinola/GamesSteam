package com.springmvc.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="user")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends BaseEntityName {

	@Transient
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@OneToOne (cascade= CascadeType.ALL)
	private Customer customer;
	
	@OneToMany (mappedBy="user",fetch=FetchType.LAZY) 
	private Set<UserItem> userItem = new HashSet<>();
	
}
