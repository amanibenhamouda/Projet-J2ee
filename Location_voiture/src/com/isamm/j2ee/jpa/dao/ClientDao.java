package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;
import com.isamm.j2ee.jpa.entités.Client;

public class ClientDao {

	public static EntityManager em;
	public static void ajouter(Client c){
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	public static void supprimer(Client c){
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}
}
