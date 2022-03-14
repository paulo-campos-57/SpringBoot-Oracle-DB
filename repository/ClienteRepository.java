package com.fuctura.Client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fuctura.Client.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
