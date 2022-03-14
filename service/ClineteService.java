package com.fuctura.Client.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fuctura.Client.model.Cliente;
import com.fuctura.Client.model.dto.ClienteDto;
import com.fuctura.Client.repository.ClienteRepository;

@Service
public class ClineteService {

	@Autowired
	private ClienteRepository repository;

	@Autowired
	ModelMapper modelMapper;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	public Cliente inserirCliente(ClienteDto cliente) {
		Cliente cli = modelMapper.map(cliente, Cliente.class);
		return this.repository.save(cli);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Cliente update(@RequestBody Cliente Cliente) {
		return repository.save(Cliente);
	}
}
