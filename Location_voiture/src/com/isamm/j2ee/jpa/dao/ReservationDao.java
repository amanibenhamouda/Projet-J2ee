package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;

import com.isamm.j2ee.jpa.entités.Reservation;

public class ReservationDao {
public static EntityManager em;
public static void ajouter(Reservation r){
	em.getTransaction().begin();
	em.persist(r);
	em.getTransaction().commit();
}
	public static void supprimer(Reservation r){
		em.getTransaction().begin();
		em.remove(r);
		em.getTransaction().commit();
	}
	public static void modifier(Reservation r){
		em.getTransaction().begin();
		em.merge(r);
		em.getTransaction().commit();
	}
}
