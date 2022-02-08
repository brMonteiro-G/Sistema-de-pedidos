package com.example.Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.Domain.Pessoa;

public class program {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Gabriel Monteiro", "brgabriel.monteiro@gmail.com");
        Pessoa p2 = new Pessoa(null, "Gabriel Monteiro", "brgabriel.monteiro@gmail.com");
        Pessoa p3 = new Pessoa(null, "Gabriel Monteiro", "brgabriel.monteiro@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);

        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("Finalizado");

    }

}
