package com.ussd.ussdplateform.DAO;

import com.ussd.ussdplateform.entities.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UtilisateurDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default") ;
    private EntityManager em ;


    public UtilisateurDAO(){
        em = emf.createEntityManager() ;
    }

    public void addUser(Utilisateur utilisateur){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(utilisateur);
        transaction.commit();
    }
}
