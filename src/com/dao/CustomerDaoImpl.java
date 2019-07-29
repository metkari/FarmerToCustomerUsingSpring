package com.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public String registerCustomer(Customer customer) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			session.saveOrUpdate(customer);
			tx.commit();
			session.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return "Success";
	}

	@Override
	@Transactional
	public String loginUser(Customer customer) {
	
		//String email= customer.getcEmail();
		//String Pass = customer.getcPassword();
		Session session=sessionFactory.openSession();
		//Query q=session.createQuery("from Customer where cEmail="+email+"");

		String hql = "FROM Customer WHERE cEmail=:email and cPassword=:password";
	Query query = session.createQuery(hql);
	
	query.setString("email",customer.getcEmail());
	query.setString("password",customer.getcPassword());
	
	List list=query.list();
	int counter=list.size();
	
	System.out.println(counter);
	
	if (counter==0) {
		
		return "failed";
		
	} else {
		
		Customer cm = (Customer) list.get(0);
		return cm.getcName();
	}
	

	
	
	
	}


	

}
