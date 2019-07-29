package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.CustomerDao;
import com.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Override
	public String registerService(Customer customer) {

		return customerDao.registerCustomer(customer);
	}

	@Override
	public String loginUser(Customer customer) {
		
		return customerDao.loginUser(customer);
	}

}

	

	
	
	
	
	
	
	
	
	


