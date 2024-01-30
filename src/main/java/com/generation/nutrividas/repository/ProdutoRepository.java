package com.generation.nutrividas.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.nutrividas.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	public List<Produto> findAllByPrecoLessThanEqualOrderByPreco (@Param("preco") BigDecimal preco);
	public List<Produto> findAllByPrecoBetweenOrderByPreco(@Param("preco") BigDecimal precoInicial, BigDecimal precoFinal);
}
