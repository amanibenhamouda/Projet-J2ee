package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;

import com.isamm.j2ee.jpa.entités.Voiture;

public class VoitureDao {
	public static EntityManager em;
	public static void ajouter(Voiture v){
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
}
	public static void supprimer(Voiture v){
		em.getTransaction().begin();
		em.remove(v);
		em.getTransaction().commit();
		
	}
	public static void modifier(Voiture v){
		em.getTransaction().begin();
		em.merge(v);
		em.getTransaction().commit();
	}
	
}
