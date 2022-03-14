package com.fuctura.Client.exceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Erro {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	
	private List<Campo> campos;
}
