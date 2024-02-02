package br.com.eduardo.drogaria2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardo.drogaria2.domain.Produto;

//JpaRepository<Tipo da classe, Tipo da chave primaria> = possui metodos de busca e outras operacoes
public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}
