package br.com.possege.biblioteca.dao;

import java.util.List;

import br.com.possege.biblioteca.domain.Livro;

public interface LivroDaoI {

	public void salva(Livro livro);

	public List<Livro> listaTodos();

	public void remove(Livro livro);

	public Livro buscaPorId(Long id);
	
}
