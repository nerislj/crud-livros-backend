package com.neri.crudlivros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neri.crudlivros.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
