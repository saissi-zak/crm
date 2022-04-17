package com.crm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.model.Ligne_commande;
import com.crm.service.LignecommandeService;

@RestController
@RequestMapping("/lignecommande")
public class LignecommandeController {

	@Autowired
	LignecommandeService lignecommandeservice;
	
	@GetMapping("/AllLignecommande")
	public List<Ligne_commande> getAlllcmd(){
		return lignecommandeservice.getalllcmd();
	}
	
	@GetMapping("/{id}")
	public Optional<Ligne_commande> getlcmdbyid(long id) {
		return lignecommandeservice.getbyidcmd(id);
	}
	
	@PutMapping("/updalcmd/{id}")
	public Ligne_commande updalmcd(@PathVariable long id, @RequestBody Ligne_commande lcmd) {
		return lignecommandeservice.updatelmcd(lcmd, id);
	}
	
	@PostMapping("/savelcmd")
	public Ligne_commande savelmcd(@RequestBody Ligne_commande lcmd) {
		return lignecommandeservice.insertlcmd(lcmd);
	}
	
	@DeleteMapping("/supplcmd/{id}")
	public String supplmcd(long id) {
		lignecommandeservice.deletelcmd(id);
		return "delete ok";
	}
}
