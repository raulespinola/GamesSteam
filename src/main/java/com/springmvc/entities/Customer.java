package com.springmvc.entities;



import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table(name="Customer")
public class Customer extends Person  {

	@OneToOne (cascade= CascadeType.ALL)
	private User user;
	
    @OneToOne (cascade= CascadeType.ALL)
	private Address addressBilling;
    
    public void setUser(User user) {
    	this.user=user;
    	user.setCustomer(this);
    }
		
}
