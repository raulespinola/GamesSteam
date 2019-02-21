package com.springmvc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Id;

import java.util.*;

@Embeddable
public class CompositeId implements Serializable {

	
	@Column
	private Long userId;
	
	@Column
	private Long itemId;	
	
	public CompositeId() {
	}

	public CompositeId(Long userId, Long itemId) {
		this.userId = userId;
		this.itemId = itemId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof CompositeId))
			return false;
		CompositeId that = (CompositeId) o;
		return Objects.equals(getUserId(), that.getUserId()) && Objects.equals(getItemId(), that.getItemId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getUserId(), getItemId());
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	
	
	

}
