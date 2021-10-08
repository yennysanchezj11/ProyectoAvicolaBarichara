package com.avicolaBarichara.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idUser;
	private String password;
	@ManyToOne
	@JoinColumn(name="id_rol")
	private Rol RolIdRol;
	@OneToOne
	@JoinColumn(name="identity_document", unique=true)
	private Person PersonIdentityDocument;
	private String email;
	
	public User() {
		
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getIdRol() {
		return RolIdRol;
	}

	public void setIdRol(Rol idRol) {
		this.RolIdRol = idRol;
	}

	public Person getIdentityDocument() {
		return PersonIdentityDocument;
	}

	public void setIdentityDocument(Person identityDocument) {
		this.PersonIdentityDocument = identityDocument;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
