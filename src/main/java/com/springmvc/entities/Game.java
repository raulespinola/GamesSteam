package com.springmvc.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name= "Game")
public class Game extends Item {

	@OneToMany
	private Set<Item> mods;
	
}
