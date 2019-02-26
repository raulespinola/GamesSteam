package com.springmvc.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springmvc.entities.Game;

public interface GameRepository extends CrudRepository<Game, Long> {

	Optional<Game> findByName(String name);
}
