package com.abk.persistence.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.abk.config.PersistenceJPAConfig;
import com.abk.persistence.model.UserDetails;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceJPAConfig.class }, loader = AnnotationConfigContextLoader.class)

public class UserDetailsServicePersistenceIntegrationTest {

	@Autowired
	private UserDetailsService service;

	@Test
	public final void whenEntityIsCreated_thenFound() {
		final UserDetails usrEntity = new UserDetails("firstName", "lastName", "email@gmail.com", new Date());
		service.create(usrEntity);
		final UserDetails found = service.findOne(usrEntity.getId());
		Assert.assertNotNull(found);
	}

}
