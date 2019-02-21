package com.springmvc.entities;

import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table
public class Description extends BaseEntity{

	@OneToOne
	private String webDescription;
	
	@OneToOne
	private String mobileDescription;
}
