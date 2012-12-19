package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;

import com.isamm.j2ee.jpa.entités.Agence;

public class AgenceDao {
	public static EntityManager em;
    public static void ajouter(Agence agence){
    	em.getTransaction().begin();
    	em.persist(agence);
    	em.getTransaction().commit();
    }
	public static void supprimer(Agence agence){
		em.getTransaction().begin();
		em.remove(agence);
		em.getTransaction().commit();
	}

}
