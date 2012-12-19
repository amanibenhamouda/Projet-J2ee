package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;

import com.isamm.j2ee.jpa.entités.Modele;

public class ModeleDao {
public static EntityManager em;
public static void ajouter(Modele m){
	em.getTransaction().begin();
	em.persist(m);
	em.getTransaction().commit();
}
public static void supprimer(Modele m){
	em.getTransaction().begin();
	em.remove(m);
	em.getTransaction().commit();
	
}
public static void modifier(Modele m){
	em.getTransaction().begin();
	em.merge(m);
	em.getTransaction();
}
	
}
