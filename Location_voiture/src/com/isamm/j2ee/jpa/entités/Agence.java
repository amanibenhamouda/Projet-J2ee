package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



/**
 * The persistent class for the agence database table.
 * 
 */
@Entity
@Table(name="agence")

public class Agence implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="code_agence")
	private int codeAgence;

	private String adresse;

	@Column(name="id_agent")
	private int idAgent;

	private String libelle;

	private int tel;

	private String ville;
	@OneToMany
	private Set<Client> clients =new HashSet<Client>();;
	@OneToMany
	private Set<Voiture> voitures =new HashSet<Voiture>();;

	public Agence() {
	}

	public int getCodeAgence() {
		return this.codeAgence;
	}

	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getIdAgent() {
		return this.idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getTel() {
		return this.tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public Set<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(Set<Voiture> voitures) {
		this.voitures = voitures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + codeAgence;
		result = prime * result + idAgent;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + tel;
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		Agence other = (Agence) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (codeAgence != other.codeAgence)
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (tel != other.tel)
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}
	
	

}