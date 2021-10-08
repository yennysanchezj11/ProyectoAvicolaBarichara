package com.avicolaBarichara.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sale implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idSale;
	@ManyToOne
	private IdentityDocument PersonIdentityDocument;
	
	public Sale() {
	
	}

	public Integer getIdSale() {
		return idSale;
	}

	public void setIdSale(Integer idSale) {
		this.idSale = idSale;
	}

	public IdentityDocument getPersonIdentityDocument() {
		return PersonIdentityDocument;
	}

	public void setPersonIdentityDocument(IdentityDocument personIdentityDocument) {
		PersonIdentityDocument = personIdentityDocument;
	}
	

}
