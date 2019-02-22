package com.springmvc.entities;

import java.util.*;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name= "Game")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Game extends Item {

	@OneToMany
	private Set<Item> mods= new HashSet<>();
	
}
