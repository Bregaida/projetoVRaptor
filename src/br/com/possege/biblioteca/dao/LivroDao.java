package br.com.possege.biblioteca.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.possege.biblioteca.domain.Livro;

@Component
@RequestScoped
public class LivroDao implements LivroDaoI {

private final static List<Livro> livros = new ArrayList<Livro>();
	
	static {
		populaProdutosIniciais();
	}
	
	public void salva(Livro livro) {
		livro.setId(livros.size() +1l);
		livros.add(livro);
	}

	public List<Livro> listaTodos() {
		return Collections.unmodifiableList(livros);
	}

	public void remove(Livro livro) {
		Iterator<Livro> it = livros.iterator();
		while(it.hasNext()) {
			Livro existente = it.next();
			if(existente.getId().equals(livro.getId())) {
				it.remove();
				break;
			}
		}
	}

	private static void populaProdutosIniciais() {
		livros.add(new Livro(1l, "Introdução À Arquitetura e Design de Software - Uma Visão Sobre a Plataforma Java", "Saraiva", new BigDecimal(73.00), "Sergio Lopes, Paulo Silveira, Guilherme Silveira"));
		livros.add(new Livro(2l, "iWOZ - a Verdadeira História da Apple Segundo Seu Cofundador", "Saraiva", new BigDecimal(49.90), "Steve Wozniak, Gina Smith"));
		livros.add(new Livro(3l, "Steve Jobs - A Biografia", "Livraria Cultura", new BigDecimal(49.90), "Walter Isaacson"));
		livros.add(new Livro(4l, "Use a cabeça! Padrões de Projetos", "Livraria Cultura", new BigDecimal(142.89), "Eric Freeman, Elisabeth Freeman"));
	}

	public Livro buscaPorId(Long id) {
		for(Livro livro : livros) {
			if(livro.getId().equals(id)){
				return livro;
			}
		}
		return null;
	}

}
