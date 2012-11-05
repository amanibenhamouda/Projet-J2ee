package com.isamm.j2ee.jpa.entités;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the administrateur database table.
 * 
 */
@Entity
@Table(name="administrateur")
public class Administrateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String login;

	private String pwd;

	public Administrateur() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}