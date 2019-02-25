package com.springmvc.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name= "mods")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Mod extends Item{

	@OneToOne
	@Column(name ="game_id")
	private Game game;
}
