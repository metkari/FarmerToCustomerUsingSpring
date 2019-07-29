package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the PRODUCTS database table.
 * 
 */
@Entity
@Table(name = "PRODUCTS_prod")

public class Product  {
	

	@Id
	@Column(name = "P_ID")
	@GeneratedValue
	private long pId;

	@Lob
	@Column(name = "P_DESCRIPTION")
	private String pDescription;
	
	
	@Column(name = "P_IMAGE")
	private String pImage;

	@Column(name = "P_NAME")
	private String pName;

	@Column(name = "P_PRICE")
	private BigDecimal pPrice;
	
	@Column(name = "P_TYPE")
	private String pType;

	public Product() {
	}

	public long getPId() {
		return this.pId;
	}

	public void setPId(long pId) {
		this.pId = pId;
	}

	public String getPDescription() {
		return this.pDescription;
	}

	public void setPDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public String getPImage() {
		return this.pImage;
	}

	public void setPImage(String pImage) {
		this.pImage = pImage;
	}

	public String getPName() {
		return this.pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public BigDecimal getPPrice() {
		return this.pPrice;
	}

	public void setPPrice(BigDecimal pPrice) {
		this.pPrice = pPrice;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pDescription=" + pDescription
				+ ", pImage=" + pImage + ", pName=" + pName + ", pPrice="
				+ pPrice + ", pType=" + pType + "]";
	}

	

}