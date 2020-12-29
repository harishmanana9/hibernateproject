package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spring.bean.UserBean;

public class UserDao {
	private SessionFactory sessionFactory;

	public UserDao() {
		
	}
	
	public UserDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveNewUser(UserBean usrObj) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(usrObj);
		tx.commit();
		session.close();
		return true;
	}
}
