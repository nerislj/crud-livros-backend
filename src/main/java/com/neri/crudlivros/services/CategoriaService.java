package com.neri.crudlivros.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neri.crudlivros.domain.Categoria;
import com.neri.crudlivros.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
		
	}

}
