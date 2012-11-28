package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;

import com.isamm.j2ee.jpa.entités.Administrateur;

public class AdministrateurDao {

	public static EntityManager em;
	public static void ajouter(Administrateur a){
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
}
	public static void supprimer(Administrateur a){
		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();
	}
	}


