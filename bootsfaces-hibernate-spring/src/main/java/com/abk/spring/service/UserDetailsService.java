package com.abk.spring.service;

import java.util.List;

import com.abk.hibernate.model.UserDetails;

public interface UserDetailsService {
	
	public UserDetails getuserDetails(int id);

    public List<UserDetails> getAllUserDetails();

	public void add(UserDetails userDetails);

	public void remove(UserDetails userDetails);

	public void update(UserDetails userDetails);

	public void reset(UserDetails userDetails);

	public boolean  removeById(int id);

}
