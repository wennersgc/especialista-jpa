package com.algaworks.commerce.util;

import com.algaworks.commerce.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IniciarUnidadeDePersistencia {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Ecommerce-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Produto produto = entityManager.find(Produto.class, 1L);
        System.out.println(produto.getNome());


        entityManager.close();
        entityManagerFactory.close();
    }
}
