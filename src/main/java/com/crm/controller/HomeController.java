package com.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Hello Word!";
	}
	
	@GetMapping("/User/{name}")
	public String NameUser(@PathVariable String name, @RequestParam(required = false) Integer age) {
		return "Hello "+name+" votre age est "+age;
	}

}
