package com.isamm.j2ee.jpa.entit�s;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((datePrise == null) ? 0 : datePrise.hashCode());
		result = prime * result
				+ ((dateRemise == null) ? 0 : dateRemise.hashCode());
		result = prime * result + numReservation;
		result = prime * result
				+ ((villeLocation == null) ? 0 : villeLocation.hashCode());
		result = prime * result
				+ ((villeOrigine == null) ? 0 : villeOrigine.hashCode());
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
		if (datePrise == null) {
			if (other.datePrise != null)
				return false;
		} else if (!datePrise.equals(other.datePrise))
			return false;
		if (dateRemise == null) {
			if (other.dateRemise != null)
				return false;
		} else if (!dateRemise.equals(other.dateRemise))
			return false;
		if (numReservation != other.numReservation)
			return false;
		if (villeLocation == null) {
			if (other.villeLocation != null)
				return false;
		} else if (!villeLocation.equals(other.villeLocation))
			return false;
		if (villeOrigine == null) {
			if (other.villeOrigine != null)
				return false;
		} else if (!villeOrigine.equals(other.villeOrigine))
			return false;
		return true;
	}

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