package com.dao;

import com.model.Customer;

public interface CustomerDao {
	
	public String registerCustomer(Customer customer);

	public String loginUser(Customer customer);

}
