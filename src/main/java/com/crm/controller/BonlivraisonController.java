package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.model.Bonlivraison;
import com.crm.service.BonlivraisonService;

@RestController
@RequestMapping("/bl")
public class BonlivraisonController {
	@Autowired
	BonlivraisonService bonlivraisonservice;
	
	@GetMapping("/Allbl")
	public List<Bonlivraison> getAllbl(){
		return bonlivraisonservice.getAllbl();
	}
	
	@GetMapping("/{id}")
	public Bonlivraison getblbyid(long id) {
		return bonlivraisonservice.getblbyid(id);
	}
	
	@PutMapping("/updabl/{id}")
	public Bonlivraison updabl(@RequestBody Bonlivraison bl,@PathVariable long id) {
		return bonlivraisonservice.updbl(bl, id);
	}
	
	@PostMapping("/savebl")
	public Bonlivraison savebl(@RequestBody Bonlivraison bl) {
		return bonlivraisonservice.savebl(bl);
	}
	
	@DeleteMapping("/suppbl")
	public String suppbl(@PathVariable long id) {
		return bonlivraisonservice.suppbl(id);
	}
}
