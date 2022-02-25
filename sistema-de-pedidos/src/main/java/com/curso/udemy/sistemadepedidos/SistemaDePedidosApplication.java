package com.curso.udemy.sistemadepedidos;

import java.util.Arrays;

import com.curso.udemy.sistemadepedidos.domain.Categoria;
import com.curso.udemy.sistemadepedidos.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaDePedidosApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SistemaDePedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");

		repository.saveAll(Arrays.asList(cat1,cat2));

		
	}

}
