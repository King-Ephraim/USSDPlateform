package com.ussd.ussdplateform.DAO;

import com.ussd.ussdplateform.entities.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UtilisateurDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa") ;
    private EntityManager em ;


    public UtilisateurDAO(){
        em = emf.createEntityManager() ;
    }

    public void rechercherParTelephone(String telephone) {

    }
    public void enregistrerUtilisateur(Utilisateur utilisateur){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(utilisateur);
        transaction.commit();
    }

    public void mettreAJourUtilisateur(Utilisateur utilisateur){

    }


}
