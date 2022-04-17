package com.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.model.Bonlivraison;
import com.crm.repository.BonlivraisonRepository;

@Service
public class BonlivraisonService {
	@Autowired
	BonlivraisonRepository bonlivraisonrepository;
	
	public List<Bonlivraison> getAllbl(){
		return bonlivraisonrepository.findAll();
	}
	
	public Bonlivraison getblbyid(long id) {
		return bonlivraisonrepository.getById(id);
	}
	
	public Bonlivraison updbl(Bonlivraison bl, long id) {
		bl.setIdbl(id);
		return bonlivraisonrepository.save(bl);
	}
	
	public Bonlivraison savebl(Bonlivraison bl) {
		return bonlivraisonrepository.save(bl);
	}
	
	public String suppbl(long id) {
		 bonlivraisonrepository.deleteById(id);
		 return "delete ok";
	}
}
