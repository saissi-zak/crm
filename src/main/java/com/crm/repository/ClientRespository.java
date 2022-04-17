package com.crm.repository;

import org.springframework.data.repository.CrudRepository;

import com.crm.model.Client;

public interface ClientRespository extends CrudRepository<Client, Long> {

}
