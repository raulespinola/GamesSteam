package com.springmvc.entities;

import java.util.*;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name= "games")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Game extends Item {

	@OneToMany
	private Set<Item> mods= new HashSet<>();
	
	@Enumerated(value = EnumType.STRING)
	private GameType gameType;
	
}
