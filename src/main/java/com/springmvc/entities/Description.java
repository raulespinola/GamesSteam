package com.springmvc.entities;

import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table(name="descriptions")
public class Description extends BaseEntity{

	@Column(name = "web_desc")
	private String webDescription;
	
	@Column(name = "mobile_desc")
	private String mobileDescription;
}
