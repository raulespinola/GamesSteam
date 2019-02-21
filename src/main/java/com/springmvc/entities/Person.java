package com.springmvc.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person extends BaseEntityName{

	private String lastName;	
	private String phone;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@OneToOne (cascade= CascadeType.ALL)
	private Address addressPersonal;
	
}
