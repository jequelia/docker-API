package com.atividade.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.pp.dao.LivroDAO;
import com.atividade.pp.dto.CadastrarEditarLivroDTO;
import com.atividade.pp.mapper.LivroMapper;
import com.atividade.pp.model.Livro;

import javassist.NotFoundException;

@Service
public class LivroService {
	@Autowired
	private LivroDAO dao;

	public Livro cadastrarLivro(CadastrarEditarLivroDTO dto) {
		Livro livro = LivroMapper.mapper(dto);
		return dao.save(livro);
	}

	public Livro editarLivroPorId(CadastrarEditarLivroDTO dto, Long id) throws NotFoundException {
		Livro livro = dao.findById(id).orElseThrow(() -> new NotFoundException("Livro não existe para ser editado."));
		Livro livroTemp = LivroMapper.mapper(dto, livro);
		return dao.save(livroTemp);
	}

	public List<Livro> buscarTodos() {
		return dao.findAll();
	}

	public Livro buscarLivroPorNome(String nome) {
		return dao.findByTituloContaining(nome);
	}

	public void excluirLivro(Long id) {
		dao.deleteById(id);
	}
}
