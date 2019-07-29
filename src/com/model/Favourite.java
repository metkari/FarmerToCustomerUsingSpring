package com.model;


import javax.persistence.*;


/**
 * The persistent class for the FAVOURITES database table.
 * 
 */
@Entity
@Table(name="FAVOURITES__prod")
public class Favourite  {
	

	@Id
	@Column(name="SR_NO")
	@GeneratedValue
	private long srNo;

	
	private Customer customer;

	
	private Product product;

	public Favourite() {
	}

	public long getSrNo() {
		return this.srNo;
	}

	public void setSrNo(long srNo) {
		this.srNo = srNo;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}