package br.com.possege.biblioteca.view.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.com.possege.biblioteca.domain.Livro;
import br.com.possege.biblioteca.service.LivroServiceI;
import br.com.possege.biblioteca.view.form.LivroForm;

@Resource
public class LivroController {

	private final Result result;

	private final LivroServiceI livroService;

	private final Validator validator;
    
    public LivroController(LivroServiceI livroService, Result result, Validator validator) {
        this.livroService = livroService;
		this.result = result;
		this.validator = validator;
    }
    
    public void formulario(){
		
	}
    
    public void consulta(){
		
   	}
    
    @Post
	public void adiciona(final LivroForm livroForm){
		 validator.checking(new Validations(){{
	            that(livroForm.getLivro().getPreco().doubleValue() > 0,"erro", "livro.preco.invalido");
	            that(!livroForm.getLivro().getTitulo().isEmpty(), "erro", "livro.titulo.nao.informado");
	            that(!livroForm.getLivro().getLoja().isEmpty(), "erro", "livro.loja.nao.informado");
	        }});
	        validator.onErrorUsePageOf(this).formulario();  
	 
	        livroService.salva(livroForm.getLivro());
	        result.redirectTo(this).lista();
	}
    
    public void remove (Livro livro){
    	livroService.remove(livro);
		result.nothing();
	}
    
    public List<Livro> lista() {
		return livroService.listaTodos();
	}
	
    @Post
	public void pesquisa(LivroForm livroForm) {
    	result.redirectTo(this).exibe(livroForm.getLivro().getId());
	}
    
	@Path("/livro/{id}")
	public LivroForm exibe(Long id){
		LivroForm livroForm = new LivroForm();
		livroForm.setLivro(livroService.buscaPorId(id));
		return livroForm;
	}
    
}
