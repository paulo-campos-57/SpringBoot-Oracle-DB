package com.fuctura.Client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTE")
	@SequenceGenerator(name = "CLIENTE", sequenceName = "S_ID_CLIENTE", allocationSize = 1, initialValue = 1)
	private Long id;
	@NotBlank(message = "Não pode ser vazio!")
	private String nome;
	@Email
	private String email;
	private String telefone;
}
