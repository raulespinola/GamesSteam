package com.springmvc.repositories;


import java.util.Optional;
import com.springmvc.entities.Game;

public interface GameRepository extends CRUDRepository<Game, Long> {

	Optional<Game> findByName(String name);
}
