package br.com.eduardo.drogaria2.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {
	private Short codigo;
	
	private String nome;
	
	private Short quantidade;
	
	private BigDecimal preco;

	private LocalDate dataDeValidade;
	
}
