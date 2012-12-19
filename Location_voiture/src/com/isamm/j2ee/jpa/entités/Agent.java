package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


/**
 * The persistent class for the agent database table.
 * 
 */
@Entity
@Table(name="agent")

public class Agent extends Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_agent")
	private int idAgent;

	private int adresse;

	private int login;

	private String nom;

	private String prenom;

	private String pwd;

	private int tel;

	private int ville;
	@OneToMany
	private Set<Client> clients =new HashSet<Client>();;


	public Agent() {
	}

	public int getIdAgent() {
		return this.idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public int getAdresse() {
		return this.adresse;
	}

	public void setAdresse(int adresse) {
		this.adresse = adresse;
	}

	public int getlogin() {
		return this.login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}

	public int getTel() {
		return this.tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public int getVille() {
		return this.ville;
	}

	public void setVille(int ville) {
		this.ville = ville;
	}
	

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adresse;
		result = prime * result + idAgent;
		result = prime * result + login;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + tel;
		result = prime * result + ville;
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
		Agent other = (Agent) obj;
		if (adresse != other.adresse)
			return false;
		if (idAgent != other.idAgent)
			return false;
		if (login != other.login)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (tel != other.tel)
			return false;
		if (ville != other.ville)
			return false;
		return true;
	}

	
}