package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the reservation database table.
 * 
 */
@Entity
@Table(name="reservation")

public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="num_reservation")
	private int numReservation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_prise")
	private Date datePrise;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_remise")
	private Date dateRemise;

	@Column(name="ville_location")
	private String villeLocation;

	@Column(name="ville_origine")
	private String villeOrigine;

	public Reservation() {
	}

	public int getNumReservation() {
		return this.numReservation;
	}

	public void setNumReservation(int numReservation) {
		this.numReservation = numReservation;
	}

	public Date getDatePrise() {
		return this.datePrise;
	}

	public void setDatePrise(Date datePrise) {
		this.datePrise = datePrise;
	}

	public Date getDateRemise() {
		return this.dateRemise;
	}

	public void setDateRemise(Date dateRemise) {
		this.dateRemise = dateRemise;
	}

	public String getVilleLocation() {
		return this.villeLocation;
	}

	public void setVilleLocation(String villeLocation) {
		this.villeLocation = villeLocation;
	}

	public String getVilleOrigine() {
		return this.villeOrigine;
	}

	public void setVilleOrigine(String villeOrigine) {
		this.villeOrigine = villeOrigine;
	}

}