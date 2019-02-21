package com.springmvc.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Address extends BaseEntity  {
		

	private String street;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
}
