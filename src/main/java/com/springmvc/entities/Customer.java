package com.springmvc.entities;



import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table(name="customers")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Customer extends Person  {

	@OneToOne (cascade= CascadeType.ALL)
	@Column(name = "user_id")
	private User user;
	
    @OneToOne (cascade= CascadeType.ALL)
    @Column(name = "address_billing_id")
	private Address addressBilling;
    
    public void setUser(User user) {
    	this.user=user;
    	user.setCustomer(this);
    }
		
}
