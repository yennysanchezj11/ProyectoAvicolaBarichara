package com.avicolaBarichara.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IdentityDocument implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String number_document;
	private String type_document;
	
	public IdentityDocument() {
		
	}

	public IdentityDocument(String numberDocument, String typeDocument) {
		super();
		this.number_document = numberDocument;
		this.type_document = typeDocument;
	}

	public String getNumberDocument() {
		return number_document;
	}

	public void setNumberDocument(String numberDocument) {
		this.number_document = numberDocument;
	}

	public String getTypeDocument() {
		return type_document;
	}

	public void setTypeDocument(String typeDocument) {
		this.type_document = typeDocument;
	}
	

}
