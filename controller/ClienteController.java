package com.fuctura.Client.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuctura.Client.model.Cliente;
import com.fuctura.Client.model.dto.ClienteDto;
import com.fuctura.Client.service.ClineteService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	@Autowired
	ClineteService service;

	@GetMapping
	@Operation(summary = "Lista todos os clientes")
	public List<Cliente> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}")
	@Operation(summary = "Busca o cliente de acordo com o ID")
	public Cliente buscarCliente(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping
	@Operation(summary = "Insere novo cliente")
	public Cliente inserir(@Valid @RequestBody ClienteDto Cliente) {
		return service.inserirCliente(Cliente);
	}

	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Deleta um cliente do banco")
	public void deletar(Long id) {
		service.delete(id);
	}

	@PutMapping
	@Operation(summary = "Altera os dados de um cliente no banco")
	public void update(@RequestBody Cliente Cliente) {
		service.update(Cliente);
	}
}
