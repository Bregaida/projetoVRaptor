package br.com.possege.biblioteca.service;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.possege.biblioteca.dao.LivroDao;
import br.com.possege.biblioteca.dao.LivroDaoI;
import br.com.possege.biblioteca.domain.Livro;

@Component
public class LivroService implements LivroServiceI{

	private LivroDaoI	livroDao;
	
	public LivroService(){
		if(livroDao==null){
			livroDao = new LivroDao();
		}
	}
	
	public void salva(Livro livro) {
		livroDao.salva(livro);
	}

	public List<Livro> listaTodos() {
		return livroDao.listaTodos();
	}

	public void remove(Livro livro) {
		livroDao.remove(livro);
	}

	public Livro buscaPorId(Long id) {
		return livroDao.buscaPorId(id);
	}

}
