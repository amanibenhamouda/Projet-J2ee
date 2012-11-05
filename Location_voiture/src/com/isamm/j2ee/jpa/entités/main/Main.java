package com.isamm.j2ee.jpa.entités.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.isamm.j2ee.jpa.entités.Client;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManager entityManager= Persistence.createEntityManagerFactory(
	    		 "Location_voiture").createEntityManager();
	    List<Client> list =entityManager.createQuery(
	    		"select c from Client c ",Client.class).getResultList();
	    for (Client client:list) {
	    	System.out.println(client.getNom());
			
		}
	}

}
