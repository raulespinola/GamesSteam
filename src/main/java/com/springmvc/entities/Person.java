package com.springmvc.entities;

import java.time.OffsetDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person extends BaseEntityName{

	@Column(name = "last_name")
	private String lastName;	
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email", nullable = true)
	private String email;
	
	@Column(name = "birth_date")
	//Check the date format
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private OffsetDateTime birthday;
	
	@OneToOne (cascade= CascadeType.ALL)
	private Address addressPersonal;
	
}
