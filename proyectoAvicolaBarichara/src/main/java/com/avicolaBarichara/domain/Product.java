package com.avicolaBarichara.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idProduct;
    private String nameProduct;
    private String descriptionProduct;
    private double unitValue;

    public Product() {
    }

    public Product(String title, String description, double unitValue) {
        this.nameProduct = title;
        this.descriptionProduct = description;
        this.unitValue = unitValue;
    }

	public Integer getProductId() {
		return idProduct;
	}

	public void setProductId(Integer productId) {
		this.idProduct = productId;
	}

	public String getTitle() {
		return nameProduct;
	}

	public void setTitle(String title) {
		this.nameProduct = title;
	}

	public String getDescription() {
		return descriptionProduct;
	}

	public void setDescription(String description) {
		this.descriptionProduct = description;
	}

	public double getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}

  

}
