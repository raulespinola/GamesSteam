package com.springmvc.entities;

import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table
public class Description extends BaseEntity{

	
	private String webDescription;
	
	
	private String mobileDescription;
}
