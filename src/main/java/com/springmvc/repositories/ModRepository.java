package com.springmvc.repositories;


import java.util.Optional;

import com.springmvc.entities.Mod;

public interface ModRepository extends CRUDRepository<Mod, Long> {
	Optional<Mod> findByName(String name);
}
