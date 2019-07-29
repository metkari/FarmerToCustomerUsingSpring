
package com.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the MYADVERTISEMENTS database table.
 * 
 */
@Entity
@Table(name="MYADVERTISEMENTS__prod")
public class Myadvertisement  {

	@Id
	@Column(name="SR_NO")
	@GeneratedValue
	private long srNo;

	
	private Customer customer;

	
	private Product product;

	public Myadvertisement() {
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

	@Override
	public String toString() {
		return "Myadvertisement [srNo=" + srNo + ", customer=" + customer
				+ ", product=" + product + "]";
	}
	

}