package com.curso.udemy.sistemadepedidos.repositories;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.udemy.sistemadepedidos.domain.Categoria;
import com.curso.udemy.sistemadepedidos.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}