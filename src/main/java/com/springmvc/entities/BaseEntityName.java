package com.springmvc.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntityName extends BaseEntity{

	@Column(name = "name", nullable = false)
	private String name;
	
	
}
