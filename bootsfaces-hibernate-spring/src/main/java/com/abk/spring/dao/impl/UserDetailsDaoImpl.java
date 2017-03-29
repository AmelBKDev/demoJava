package com.abk.spring.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.abk.hibernate.model.UserDetails;
import com.abk.spring.dao.UserDetailsDao;

public class UserDetailsDaoImpl implements UserDetailsDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	@Transactional
	@Override
	public UserDetails getuserDetails(int id) {
		// TODO Auto-generated method stub
		UserDetails userDetails = (UserDetails)sessionFactory.getCurrentSession().get(UserDetails.class,id);
		return userDetails;
	}

	@Transactional
	@Override
	public List<UserDetails> getAllUserDetails() {
		// TODO Auto-generated method stub
		List<UserDetails> list = (List<UserDetails>) sessionFactory.getCurrentSession().createCriteria(UserDetails.class).list();
		return list;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public Serializable add(UserDetails userDetails) {
		Serializable res = sessionFactory.getCurrentSession().save(userDetails);
		System.out.println(res);
		return res;
		
		
	}

	@Transactional
	@Override
	public void remove(UserDetails userDetails) {
		sessionFactory.getCurrentSession().delete(userDetails);
		
	}

	@Transactional
	@Override
	public boolean removeById( int id) {
		UserDetails persistentInstance = getuserDetails(id);
	    if (persistentInstance != null) {
	    	sessionFactory.getCurrentSession().delete(persistentInstance);
	        return true;
	    }

	    return false;
	}
	
	@Transactional
	@Override
	public void update(UserDetails userDetails) {
		sessionFactory.getCurrentSession().update(userDetails);
		
	}

}
