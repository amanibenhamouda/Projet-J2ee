package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reservation database table.
 * 
 */
@Entity
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="num_reservation")
	private int numReservation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_location")
	private Date dateLocation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_retour")
	private Date dateRetour;

	@Column(name="id_agence")
	private int idAgence;

	@Column(name="id_agent")
	private int idAgent;

	@Column(name="id_client")
	private int idClient;

	@Column(name="num_voiture")
	private int numVoiture;

	private float prix;

	public Reservation() {
	}

	public int getNumReservation() {
		return this.numReservation;
	}

	public void setNumReservation(int numReservation) {
		this.numReservation = numReservation;
	}

	public Date getDateLocation() {
		return this.dateLocation;
	}

	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}

	public Date getDateRetour() {
		return this.dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public int getIdAgence() {
		return this.idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public int getIdAgent() {
		return this.idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getNumVoiture() {
		return this.numVoiture;
	}

	public void setNumVoiture(int numVoiture) {
		this.numVoiture = numVoiture;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateLocation == null) ? 0 : dateLocation.hashCode());
		result = prime * result
				+ ((dateRetour == null) ? 0 : dateRetour.hashCode());
		result = prime * result + idAgence;
		result = prime * result + idAgent;
		result = prime * result + idClient;
		result = prime * result + numReservation;
		result = prime * result + numVoiture;
		result = prime * result + Float.floatToIntBits(prix);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		if (dateLocation == null) {
			if (other.dateLocation != null)
				return false;
		} else if (!dateLocation.equals(other.dateLocation))
			return false;
		if (dateRetour == null) {
			if (other.dateRetour != null)
				return false;
		} else if (!dateRetour.equals(other.dateRetour))
			return false;
		if (idAgence != other.idAgence)
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (idClient != other.idClient)
			return false;
		if (numReservation != other.numReservation)
			return false;
		if (numVoiture != other.numVoiture)
			return false;
		if (Float.floatToIntBits(prix) != Float.floatToIntBits(other.prix))
			return false;
		return true;
	}
	

}