package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the modele database table.
 * 
 */
@Entity
@Table(name="modele")

public class Modele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_modele")
	private int idModele;

	private String marque;

	@Column(name="num_passagers")
	private int numPassagers;

	@Column(name="num_porte")
	private int numPorte;

	public Modele() {
	}

	public int getIdModele() {
		return this.idModele;
	}

	public void setIdModele(int idModele) {
		this.idModele = idModele;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getNumPassagers() {
		return this.numPassagers;
	}

	public void setNumPassagers(int numPassagers) {
		this.numPassagers = numPassagers;
	}

	public int getNumPorte() {
		return this.numPorte;
	}

	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idModele;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + numPassagers;
		result = prime * result + numPorte;
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
		Modele other = (Modele) obj;
		if (idModele != other.idModele)
			return false;
		if (marque == null) {
			if (other.marque != null)
				return false;
		} else if (!marque.equals(other.marque))
			return false;
		if (numPassagers != other.numPassagers)
			return false;
		if (numPorte != other.numPorte)
			return false;
		return true;
	}
	

}