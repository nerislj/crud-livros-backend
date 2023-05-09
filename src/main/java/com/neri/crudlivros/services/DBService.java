package com.neri.crudlivros.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neri.crudlivros.domain.Categoria;
import com.neri.crudlivros.domain.Livro;
import com.neri.crudlivros.repositories.CategoriaRepository;
import com.neri.crudlivros.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instaciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Ficção", "Livro de Ficção");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografias");

		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem Ipsum", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis", "Lorem Ipsum", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "Robert Martin", "Lorem Ipsum", cat2);
		Livro l4 = new Livro(null, "The war of the Worlds", "Wells", "Lorem Ipsum", cat2);
		Livro l5 = new Livro(null, "A cabana", "Fulano", "Lorem Ipsum", cat3);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4));
		cat3.getLivros().addAll(Arrays.asList(l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
