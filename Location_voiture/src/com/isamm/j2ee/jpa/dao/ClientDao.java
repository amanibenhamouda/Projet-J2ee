package com.isamm.j2ee.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import com.isamm.j2ee.jpa.entités.Client;
import com.isamm.j2ee.jpa.entités.Reservation;

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
	public void modifier(Client c){
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
	}
	public void ajouterReservationClient( int idClient, int numReservation) {
        em.getTransaction().begin();
        Client c=(Client)em.getReference(Client.class,idClient);
        Reservation r=(Reservation)em.getReference(Reservation.class,numReservation);
        c.getReservations().add(r);
        em.getTransaction().commit();
	}
	public Client getClient(int idClient) {
		em.getTransaction().begin();
		Client c=(Client)em.find(Client.class, idClient);
		em.getTransaction().commit();
		return c;	
	}
	public List<Client> listClients() {
		em.getTransaction().begin();
		List<Client> listClient=em.createNamedQuery("Client.findAll").getResultList();
		return listClient;
		
	}
	
}
