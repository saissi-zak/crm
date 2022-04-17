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

import com.crm.model.Fournisseur;
import com.crm.service.FournisseurService;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
	
	@Autowired
	FournisseurService fournisseurservice;
	
	@GetMapping("/Allfournisseur")
	public List<Fournisseur> getAllfrs(){
		return fournisseurservice.getAllfrs();
	}
	
	@GetMapping("/frs/{id}")
	public Fournisseur getfrsbyid(long id) {
		return fournisseurservice.getfrsbyid(id);
	}
	
	@PutMapping("/updfrs/{id}")
	public Fournisseur updafrs(@RequestBody Fournisseur frs,@PathVariable long id) {
		return fournisseurservice.updatefrs(frs, id);
	}
	
	@PostMapping("/savefrs")
	public Fournisseur saveFrs(@RequestBody Fournisseur frs) {
		return fournisseurservice.savefrs(frs);
	}
	
	@DeleteMapping("/suppfrs/{id}")
	public String suppfrs(long id) {
		fournisseurservice.suppfrs(id);
		return "delete ok";
	}
}
