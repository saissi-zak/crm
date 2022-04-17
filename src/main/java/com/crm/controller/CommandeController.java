package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.model.Commande;
import com.crm.service.CommandeService;

@RestController
@RequestMapping("/commande")
public class CommandeController {

		@Autowired
		CommandeService commandeservice;
		
		@GetMapping("/Allcommande")
		public List<Commande> getAll(){
			return commandeservice.getAll();
		}
		
		@GetMapping("/commande/{id}")
		public Commande getbyId(long id) {
			return commandeservice.getbyId(id);
		}
		
		@PutMapping("/modficmd/{id}")
		public Commande updatecmd(@PathVariable long id, @RequestBody Commande cmd) {
			return commandeservice.updatecmd(cmd, id);
		}
		
		@PostMapping("/savecmfd")
		public Commande savecmd(@RequestBody Commande cmd) {
			return commandeservice.insert(cmd);
		
		}
		
		/*@GetMapping("/commandeclt/{id}")
		public List<Commande> cmdbyclt(@PathVariable long id) {
			return commandeservice.findcmdbyclt(id);
		}*/
}
