package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.model.Fournisseur;
import com.crm.repository.FournisseurRespository;

@Service
public class FournisseurService {

	@Autowired
	FournisseurRespository fournisseurrepository;
	
	public List<Fournisseur> getAllfrs(){
		return fournisseurrepository.findAll();
	}
	
	public Fournisseur getfrsbyid(long id) {
		return fournisseurrepository.getById(id);
	}
	
	public Fournisseur updatefrs(Fournisseur frs, long id) {
		frs.setIdfrs(id);
		return fournisseurrepository.save(frs);
	}
	
	public Fournisseur savefrs(Fournisseur frs) {
		return fournisseurrepository.save(frs);
	}
	public String suppfrs(long id) {
		fournisseurrepository.deleteById(id);
		return "delete ok";
	}
}
