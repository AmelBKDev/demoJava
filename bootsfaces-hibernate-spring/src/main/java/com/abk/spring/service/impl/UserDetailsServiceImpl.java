package com.abk.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abk.hibernate.model.UserDetails;
import com.abk.spring.dao.UserDetailsDao;
import com.abk.spring.service.UserDetailsService;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserDetailsDao userDetailsDao;

	public UserDetailsDao getUserDetailsDao() {
		return userDetailsDao;
	}

	@Override
	public UserDetails getuserDetails(int id) {
		// TODO Auto-generated method stub
		return getUserDetailsDao().getuserDetails(id);
	}

	@Override
	public List<UserDetails> getAllUserDetails() {
		// TODO Auto-generated method stub
		return getUserDetailsDao().getAllUserDetails();
	}

	@Override
	public void add(UserDetails userDetails) {
		getUserDetailsDao().add(userDetails);
		
	}

	@Override
	public void remove(UserDetails userDetails) {
		getUserDetailsDao().remove(userDetails);
		
	}

	@Override
	public void update(UserDetails userDetails) {
		getUserDetailsDao().update(userDetails);
		
	}

	@Override
	public void reset(UserDetails userDetails) {
		userDetails.setDob(null);
		userDetails.setEmail(null);
		userDetails.setFirstName(null);
		userDetails.setId(null);
		userDetails.setLastName(null);
		
	}
	
	@Override
	public boolean removeById(int id){
		return getUserDetailsDao().removeById(id);
	}

}
