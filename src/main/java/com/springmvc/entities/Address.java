package com.springmvc.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Address  {
		
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String street;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
}
