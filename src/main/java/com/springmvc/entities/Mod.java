package com.springmvc.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name= "mod")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Mod extends Item{

	@OneToOne
	private Game game;
}
