package com.atividade.pp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade.pp.model.Livro;
@Repository
public interface LivroDAO extends JpaRepository<Livro, Long>{
	public Livro findByTituloContaining(String titulo);
}
