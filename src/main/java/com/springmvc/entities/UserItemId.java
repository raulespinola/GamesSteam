package com.springmvc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Id;

import java.util.*;

@Embeddable
public class UserItemId implements Serializable {

	
	@Column(name = "userId", nullable = false)
	private Long userId;
	
	@Column(name = "gameId", nullable = false)
	private Long itemId;

	
	
	public UserItemId() {
	}

	public UserItemId(Long userId, Long itemId) {
		this.userId = userId;
		this.itemId = itemId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof UserItemId))
			return false;
		UserItemId that = (UserItemId) o;
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
