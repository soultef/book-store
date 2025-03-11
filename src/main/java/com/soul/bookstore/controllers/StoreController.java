package com.soul.bookstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	
	@GetMapping("/")
	public String store()
	{
		return "Hello store"; 
	}

}
