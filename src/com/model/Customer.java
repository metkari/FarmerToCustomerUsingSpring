package com.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.model.Favourite;
import com.model.Myadvertisement;

@Entity
@Table(name="CUSTOMERS_prod")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="C_ID")
	private long cId;

	@Column(name="C_ADDRESS")
	private String cAddress;

	@Column(name="C_EMAIL")
	private String cEmail;

	@Column(name="C_MOBILENO")
	private BigDecimal cMobileno;

	@Column(name="C_NAME")
	private String cName;

	@Column(name="C_PASSWORD")
	private String cPassword;

	
	
	


	public Customer(long cId, String cAddress, String cEmail, BigDecimal cMobileno, String cName, String cPassword) {
		super();
		this.cId = cId;
		this.cAddress = cAddress;
		this.cEmail = cEmail;
		this.cMobileno = cMobileno;
		this.cName = cName;
		this.cPassword = cPassword;
	}
	
	public Customer() {
		System.out.println("in cust default");
	}
	


	public long getcId() {
		return cId;
	}


	public void setcId(long cId) {
		this.cId = cId;
	}


	public String getcAddress() {
		return cAddress;
	}


	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}


	public String getcEmail() {
		return cEmail;
	}


	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}


	public BigDecimal getcMobileno() {
		return cMobileno;
	}


	public void setcMobileno(BigDecimal cMobileno) {
		this.cMobileno = cMobileno;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getcPassword() {
		return cPassword;
	}


	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}


	


}
