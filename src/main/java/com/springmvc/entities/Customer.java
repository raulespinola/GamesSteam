package com.springmvc.entities;



import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table(name="customer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Customer extends Person  {

	@OneToOne (cascade= CascadeType.ALL)
	private User user;
	
    @OneToOne (cascade= CascadeType.ALL)
	private Address addressBilling;
    		
}
