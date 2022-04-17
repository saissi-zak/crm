package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.crm.model.Commande;
import com.crm.repository.CommandeRepository;

@Service
public class CommandeService {
	
	@Autowired
	CommandeRepository commanderepository;
	
	public List<Commande> getAll(){
		return commanderepository.findAll();
		}
	
	public Commande getbyId(long id){
		return commanderepository.getById(id);
	}
	
	public Commande insert(Commande cmd){
		return commanderepository.save(cmd);
	}
	
	public String deletecmd(long id) {
		commanderepository.deleteById(id);
		return "delete ok";
	}
	
	public Commande updatecmd(Commande cmd, long id){
		cmd.setIdcommande(id);
		return commanderepository.save(cmd);
	}
	
	/*public List<Commande> findcmdbyclt(@Param("id") long id) {
		return commanderepository.findcmdbyclt(id);
	}*/
}
