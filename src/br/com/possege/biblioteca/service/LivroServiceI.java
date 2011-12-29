package br.com.possege.biblioteca.service;

import java.util.List;

import br.com.possege.biblioteca.domain.Livro;


public interface LivroServiceI {
	
	public void salva(Livro livro);

	public List<Livro> listaTodos();

	public void remove(Livro livro);

	public Livro buscaPorId(Long id);
}
