package com.haoliveira.client.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.haoliveira.client.dto.ClientDTO;
import com.haoliveira.client.entities.Client;
import com.haoliveira.client.repositories.ClientRepository;
import com.haoliveira.client.services.exceptions.EntityNotFoundExceptions;



@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());

	}
	@Transactional(readOnly = true)
	public ClientDTO findId(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(()-> new EntityNotFoundExceptions("Entity not Found"));
		return new ClientDTO(entity);
	}
		
}
