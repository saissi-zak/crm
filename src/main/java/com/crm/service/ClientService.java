package com.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.model.Client;
import com.crm.repository.ClientRespository;

@Service
public class ClientService {

	@Autowired
	ClientRespository clientrepository;
	
	public List<Client> getAll(){
		return (List<Client>) clientrepository.findAll();
	}
	
	public Optional<Client> findById(long id) {
		return clientrepository.findById(id);
	}
	
	public Client insertclient(Client client) {
		return clientrepository.save(client);
	}
	
	public String deleteclient(long id) {
		 clientrepository.deleteById(id);
		 return "delete ok";
	}
	
	public Client updateclient(Client client, long id) {
		client.setId(id);
		return clientrepository.save(client);
	}
	
	
}
