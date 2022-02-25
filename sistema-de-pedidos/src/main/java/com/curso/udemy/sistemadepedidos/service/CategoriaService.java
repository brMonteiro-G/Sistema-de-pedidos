package com.curso.udemy.sistemadepedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.curso.udemy.sistemadepedidos.domain.Categoria;
import com.curso.udemy.sistemadepedidos.repositories.CategoriaRepository;
import java.util.Optional;



@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository; 
    
    public Optional<Categoria> find(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj;
    }

    

    

}
