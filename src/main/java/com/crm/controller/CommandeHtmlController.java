package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.model.Commande;
import com.crm.model.Fournisseur;
import com.crm.model.Ligne_commande;
import com.crm.model.Product;
import com.crm.service.CommandeService;
import com.crm.service.FournisseurService;
import com.crm.service.LignecommandeService;
import com.crm.service.ProductService;

@Controller
@RequestMapping("/web/commande")
public class CommandeHtmlController {
	@Autowired
	CommandeService commandeservice;
	@Autowired
	FournisseurService fournisseurservice;
	@Autowired
	ProductService productservice;
	@Autowired
	LignecommandeService lignecommandeservice;
	
	@GetMapping("")
	public String commandeAll(Model model) {
		List<Commande> cmd = (List<Commande>)commandeservice.getAll();
		model.addAttribute("commandes", cmd);
		return "commande/commande";
	}
	
	@GetMapping("/new")
	public String savecmd(Model model) {
		model.addAttribute("cmd", new Commande());
		List<Fournisseur> frss = (List<Fournisseur>)fournisseurservice.getAllfrs();
		model.addAttribute("frss", frss);
		List<Product> prd = (List<Product>)productservice.getAllProduct();
		model.addAttribute("artt", prd);
		model.addAttribute("lcmd", new Ligne_commande());
		return "commande/addcommande";
	} 
	
	@PostMapping("")
	public String savecmd(@ModelAttribute Commande cmd, @ModelAttribute Ligne_commande lcmd) {
		commandeservice.insert(cmd);
		lignecommandeservice.insertlcmd(lcmd);
		return "redirect:/web/commande";
	}
}
