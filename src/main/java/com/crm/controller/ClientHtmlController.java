package com.crm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.model.Client;
import com.crm.service.ClientService;

@Controller
@RequestMapping("/web/client")
public class ClientHtmlController {
	@Autowired
	ClientService clientservice;
	
	@GetMapping("")
	public String index(Model model) {
		List<Client> clt=(List<Client>)clientservice.getAll();
		model.addAttribute("clients", clt);
		return "clients";
	}
	
	
	@GetMapping("/new")
	public String newclt(Model model) {
		model.addAttribute("clt", new Client());
		return "addclient";
	}
	
	@PostMapping("")
	public String saveclt(@ModelAttribute Client clt) {
		clientservice.insertclient(clt);
			return "redirect:/web/client";
	} 
	
	@GetMapping("/{id}/edit")
	public String getcltforedit(@PathVariable long id, Model model) {
		Optional<Client> clt = clientservice.findById(id);
		model.addAttribute("clt", clt);
		return "editclient";
	}
	
	@PostMapping("/{id}/edit")
	public String updateclient(@PathVariable long id,@ModelAttribute Client clt) {
		Client cltt = clientservice.findById(id).get();
			cltt.setName(clt.getName());
			cltt.setPrenom(clt.getPrenom());
			clientservice.updateclient(cltt, id);
		return  "redirect:/web/client";
	}
}
