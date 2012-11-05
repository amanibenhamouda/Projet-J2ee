package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the facture database table.
 * 
 */
@Entity
@Table(name="facture")

public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_facture")
	private int idFacture;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private float prix;

	public Facture() {
	}

	public int getIdFacture() {
		return this.idFacture;
	}

	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}