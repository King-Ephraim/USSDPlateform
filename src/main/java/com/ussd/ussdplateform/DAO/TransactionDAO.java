package com.ussd.ussdplateform.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TransactionDAO {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa") ;
    private EntityManager em ;

    public TransactionDAO(){
        em = emf.createEntityManager();
    }



}
