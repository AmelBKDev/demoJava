package com.abk.persistence.dao;

import java.util.List;

import com.abk.persistence.model.UserDetails;

public interface IUserDetailsDAO {

	UserDetails findOne(Integer id);

	List<UserDetails> findAll();

	void create(UserDetails entity);

	UserDetails update(UserDetails entity);

	void delete(UserDetails entity);

	void deleteById(Integer entityId);

}
