package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
public class AuthorController {
	
	
	
	@Autowired
	private WebClient author;
	
	
	@GetMapping(path= "/author/authors")
	public Flux<String> getAllauthors(){
		
		return author.get().uri("http://AUTHOR SERVICE/authors").retrieve().bodyToFlux(String.class);
		
	}


}
