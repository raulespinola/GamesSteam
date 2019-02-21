package com.springmvc.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table
public class Mod extends Item{

	@OneToOne
	private Game game;
}
