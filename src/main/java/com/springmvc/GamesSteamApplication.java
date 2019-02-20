package com.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.springmvc", "com.springmvc.entities", "com.springmvc.services",
		"com.springmvc.controllers", "com.springmvc.bootstrap", "com.springmvc.services.map" })
public class GamesSteamApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesSteamApplication.class, args);
	}

}
