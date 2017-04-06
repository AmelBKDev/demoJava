package com.abk.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abk.persistence.dao.IUserDetailsDAO;
import com.abk.persistence.model.UserDetails;

@Service
@Transactional
public class UserDetailsService {

	@Autowired
	private IUserDetailsDAO dao;

	public UserDetailsService() {
		super();
	}

	// API

	public void create(final UserDetails entity) {
		dao.create(entity);
	}

	public void delete(final UserDetails entity) {
		dao.deleteById(entity.getId());
	}

	public void update(final UserDetails entity) {
		dao.update(entity);
	}

	public UserDetails findOne(final Integer id) {
		return dao.findOne(id);
	}

	public List<UserDetails> findAll() {
		return dao.findAll();
	}

	public void reset(final UserDetails entity) {
		entity.setDob(null);
		entity.setEmail(null);
		entity.setFirstName(null);
		entity.setId(null);
		entity.setLastName(null);

	}

}
