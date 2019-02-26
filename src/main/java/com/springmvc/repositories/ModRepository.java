package com.springmvc.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springmvc.entities.Mod;

public interface ModRepository extends CrudRepository<Mod, Long> {
	Optional<Mod> findByName(String name);
}
