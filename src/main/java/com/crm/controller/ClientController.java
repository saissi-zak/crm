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

import com.crm.model.Client;
import com.crm.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	ClientService clientservice;
	
	@GetMapping("/")
	public List<Client> getAll(){
		return clientservice.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Client> findOne(@PathVariable long id) {
		return clientservice.findById(id);
	}
	
	@PostMapping("/")
	public Client saveclient(@RequestBody Client c) {
		return clientservice.insertclient(c);
	}
	
	@DeleteMapping("/{id}")
	public String deleteclient(@PathVariable long id) {
		return clientservice.deleteclient(id);
		
	}
	
	@PutMapping("/{id}")
	public Client updateclient(@PathVariable long id, @RequestBody Client c) {
		return clientservice.updateclient(c, id);
	}
	
}
