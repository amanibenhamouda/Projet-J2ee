package com.isamm.j2ee.jpa.dao;

import javax.persistence.EntityManager;

import com.isamm.j2ee.jpa.entités.Agent;

public class AgentDao {
public static EntityManager em;
public static void ajouter(Agent agent){
	em.getTransaction().begin();
	em.persist(agent);
	em.getTransaction().commit();
}
public static void supprimer(Agent agent){
	em.getTransaction().begin();
	em.remove(agent);
	em.getTransaction().commit();
}
}
