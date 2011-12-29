package br.com.possege.biblioteca.domain;

import java.math.BigDecimal;

public class Livro {

	private Long id;
	private String titulo;
	private String loja;
	private BigDecimal preco;
	private String autor;
	
	public Livro(Long id, String titulo, String loja, BigDecimal preco, String autor){
		this.id = id;
		this.titulo = titulo;
		this.loja = loja;
		this.preco = preco;
		this.autor = autor;
	}
	
	public Livro() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
