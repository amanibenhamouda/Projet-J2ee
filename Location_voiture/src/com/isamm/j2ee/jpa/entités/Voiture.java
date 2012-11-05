package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the voiture database table.
 * 
 */
@Entity
@Table(name="voiture")

public class Voiture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int matricule;

	private String couleur;

	private String marque;

	public Voiture() {
	}

	public int getMatricule() {
		return this.matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getCouleur() {
		return this.couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

}