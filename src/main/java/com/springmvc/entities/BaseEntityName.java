package com.springmvc.entities;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntityName extends BaseEntity{

	private String name;
	private String email;
}
