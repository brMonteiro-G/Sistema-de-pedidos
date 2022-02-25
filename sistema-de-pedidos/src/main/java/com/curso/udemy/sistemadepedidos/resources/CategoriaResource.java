package com.curso.udemy.sistemadepedidos.resources;



import com.curso.udemy.sistemadepedidos.domain.Categoria;
import com.curso.udemy.sistemadepedidos.service.CategoriaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.Optional;



@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service; //CategoriaService service = new CategoriaService(); ???
    
    

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Categoria>> find(@PathVariable Integer id) {
          Optional<Categoria> obj =  service.find(id);
          return ResponseEntity.ok().body(obj);
    }

}
