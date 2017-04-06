package com.abk.persistence.dao;

import org.springframework.stereotype.Repository;

import com.abk.persistence.model.UserDetails;

@Repository
public class UserDetailsDAO extends AbstractJpaDAO<UserDetails> implements IUserDetailsDAO {

	public UserDetailsDAO() {
		super();
		setClazz(UserDetails.class);
	}

}
