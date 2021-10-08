package com.avicolaBarichara.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetailsSale implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idDetailsSale;
	private int quantities;
	@ManyToOne
	@JoinColumn(name="id_sale")
	private Sale saleIdSale;
	@ManyToOne
	@JoinColumn(name="id_product")
	private Product ProductIdProduct;
	
	public DetailsSale() {
		
	}

	public Integer getIdDetailsSale() {
		return idDetailsSale;
	}

	public void setIdDetailsSale(Integer idDetailsSale) {
		this.idDetailsSale = idDetailsSale;
	}

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	public Sale getSaleIdSale() {
		return saleIdSale;
	}

	public void setSaleIdSale(Sale saleIdSale) {
		this.saleIdSale = saleIdSale;
	}

	public Product getIdProduct() {
		return ProductIdProduct;
	}

	public void setIdProduct(Product idProduct) {
		this.ProductIdProduct = idProduct;
	}

	
	

}
