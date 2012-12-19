package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.isamm.j2ee.jpa.entités.Agence;

public class AgenceDao {
	@PersistenceContext
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
	public static void modifier(Agence agence){
		em.getTransaction().begin();
		em.merge(agence);
		em.getTransaction().commit();
	}

}
