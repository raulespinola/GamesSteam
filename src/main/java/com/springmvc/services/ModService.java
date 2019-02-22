package com.springmvc.services;

import java.util.List;

import com.springmvc.entities.Mod;

public interface ModService extends CRUDService<Mod, Long> {
	List<Mod> findByName(String name);
}
