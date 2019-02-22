package com.springmvc.services;

import java.util.List;

import com.springmvc.entities.Customer;
import com.springmvc.entities.Game;

public interface GameService extends CRUDService<Game, Long> {

	List<Game> findByName(String name);
}
