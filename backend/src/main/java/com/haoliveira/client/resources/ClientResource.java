package com.haoliveira.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haoliveira.client.entities.Client;



@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity <List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Halef Oliveira","8569487563", 2000.00, null, 5));
		list.add(new Client(2L,"Halef Alves","98756984265", 2000.00, null, 0));
		//list.add(new Client(3L,"Desenvolvedor"));
		return ResponseEntity.ok().body(list);
	}
}
