package com.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.model.Ligne_commande;
import com.crm.repository.LignecommandeRepository;

@Service
public class LignecommandeService {

		@Autowired
		LignecommandeRepository lignecommanderepository;
		
		public List<Ligne_commande> getalllcmd(){
			return lignecommanderepository.findAll();
		}
		
		public Optional<Ligne_commande> getbyidcmd(long id) {
			return lignecommanderepository.findById(id);
		}
		
		public Ligne_commande insertlcmd(Ligne_commande lcmd) {
			return lignecommanderepository.save(lcmd);
		}
			
		public Ligne_commande updatelmcd(Ligne_commande lcmd, long id) {
			lcmd.setId(id);
			return lignecommanderepository.save(lcmd);
		}
		
		public String deletelcmd(long id) {
			lignecommanderepository.deleteById(id);
			return "delete ok";
		}
}
