package com.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import com.springmvc.repositories.*;
import com.springmvc.entities.*;

@Controller
public class IndexController {

	private GameRepository gameRepository;
	private ModRepository modRepository;
	private UserRepository userRepository;
		
	
//	@Autowired
//	public void setGameRepository(GameRepository gameRepository) {
//		this.gameRepository = gameRepository;
//	}
//	
//	@Autowired
//	public void setModRepository(ModRepository modRepository) {
//		this.modRepository = modRepository;
//	}
//	
//	@Autowired
//	public void setUserRepository(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	
	
	
//	//@Autowired
//	public IndexController(GameRepository gameRepository, ModRepository modRepository, UserRepository userRepository) {
//		this.gameRepository = gameRepository;
//		this.modRepository = modRepository;
//		this.userRepository = userRepository;
//	}

	@RequestMapping({"", "/", "/index"})
	public String index() {
		
//		Optional<Game> gameOptional = gameRepository.findByName("Diablo 2");
//		Optional<Mod> modOptional = modRepository.findByName("Destiny Fate");
//		Optional<User> userOptional = userRepository.findByName("Monchi");
//		
//		
//		System.out.println("User ID" + userOptional.get().getId());
//		System.out.println("Game ID" + gameOptional.get().getId());
//		System.out.println("Mod ID" + modOptional.get().getId());
		
					
		return "index";
	}
}
