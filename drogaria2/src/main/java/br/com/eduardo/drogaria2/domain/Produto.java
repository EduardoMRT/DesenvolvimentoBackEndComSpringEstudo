package br.com.eduardo.drogaria2.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity //diz que essa classe 'produto' é uma entidade
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(nullable = false) // unique false = pode repetir
	private Short quantidade;
	
	@Column(nullable = false, precision = 5, scale = 2)
	private BigDecimal preco;

	@Column(nullable = false)
	private LocalDate dataDeValidade;
	
	@ManyToOne
	//se for OneToOne o unique tem que ser true, se for ManyToOne unique = falso (padrao)
	@JoinColumn(nullable = false)
	private Categoria categoria;
}
