package br.com.eduardo.drogaria2.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.eduardo.drogaria2.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired //injeta uma instancia no objeto
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(null, "Coca Cola", Short.valueOf("15"), BigDecimal.valueOf(10.50),
				LocalDate.of(2024, 12, 23), null);
		
		Produto p2 = new Produto(null, "Pepsi", Short.valueOf("21"), BigDecimal.valueOf(9.50),
				LocalDate.of(2024, 12, 24), null);

		produtoRepository.save(p1);
		produtoRepository.save(p2);
	}
}
