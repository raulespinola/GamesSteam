package com.springmvc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.Id;

import java.util.*;

@Embeddable
public class ItemUserId implements Serializable {

	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="game_id")
	private Long gameId;	
	
	public ItemUserId() {
	}

	public ItemUserId(Long userId, Long gameId) {
		this.userId = userId;
		this.gameId = gameId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ItemUserId))
			return false;
		ItemUserId that = (ItemUserId) o;
		return Objects.equals(getUserId(), that.getUserId()) && Objects.equals(getGameId(), that.getGameId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getUserId(), getGameId());
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	
	
	

}
