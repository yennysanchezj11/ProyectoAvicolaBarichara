package com.avicolaBarichara.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_person;
	private String name;
    private String cellphone;
    private String address;
    private String district;
    private String city;
  
    @JoinColumn(name="identity_document", unique=true)
    @OneToOne(cascade=CascadeType.ALL)
    private IdentityDocument identity_document;
    
    
    public Person() {
    	identity_document= new IdentityDocument();
    }

	public Person(Integer id_person,String name, String cellphone, String address, String district, String city,
			IdentityDocument identityDocument) {
		super();
		this.id_person=id_person;
		this.name = name;
		this.cellphone = cellphone;
		this.address = address;
		this.district = district;
		this.city = city;
		this.identity_document = identityDocument;
	}
	
	

	public Integer getId_person() {
		return id_person;
	}

	public void setId_person(Integer id_person) {
		this.id_person = id_person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public IdentityDocument getIdentityDocument() {
		return identity_document;
	}

	public void setIdentityDocument(IdentityDocument identityDocument) {
		this.identity_document = identityDocument;
	}
   
    

}
