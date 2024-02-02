package br.com.eduardo.drogaria2.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // serve para carregar o contexto do spring
public class ProdutoTests {
	@Test
	public void criar() {
		Produto p = new Produto(Short.valueOf("1"), "Coca Cola", Short.valueOf("15"), BigDecimal.valueOf(10.50), LocalDate.of(2024, 12, 23));
	
		System.out.println(p);
	}
}
