package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.model.Fournisseur;
import com.crm.service.FournisseurService;

@Controller
@RequestMapping("/web/fournisseur")
public class FournisseurHtmlController {
	@Autowired
	FournisseurService fournisseurservice;
	
	@GetMapping("")
	public String getAllfrs(Model model) {
		List<Fournisseur> frs = (List<Fournisseur>)fournisseurservice.getAllfrs();
		model.addAttribute("fournisseurs", frs);
		return "fournisseur/fournisseur";
	}
	
	@GetMapping("/new")
	public String newfrs(Model model) {
		model.addAttribute("frs", new Fournisseur());
		return "fournisseur/addfournisseur";
	}
	
	@PostMapping("")
	public String savefrs(@ModelAttribute Fournisseur frs) {
		fournisseurservice.savefrs(frs);
		return "redirect:/web/fournisseur";
	}
}
