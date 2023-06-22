package com.haoliveira.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haoliveira.client.entities.Client;
import com.haoliveira.client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	public List<Client> findAll(){
		return repository.findAll();
	}
		
}
