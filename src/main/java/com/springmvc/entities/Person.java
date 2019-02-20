package com.springmvc.entities;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person extends BaseEntityName{

	private String lastName;	
	private String phone;
	
	@OneToOne (cascade= CascadeType.ALL)
	private Address addressPersonal;
	
}
