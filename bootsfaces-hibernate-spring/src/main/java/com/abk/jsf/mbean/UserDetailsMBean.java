package com.abk.jsf.mbean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.abk.hibernate.model.UserDetails;
import com.abk.spring.service.UserDetailsService;

@ManagedBean
@ViewScoped
public class UserDetailsMBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5284375997088938438L;

	// inject spring bean via DI
	@ManagedProperty("#{userDetailsService}")
	private UserDetailsService userDetailsService;

	@ManagedProperty("#{userDetails}")
	private UserDetails userDetails;

	private List<UserDetails> userDetailsList;

	private int id;

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	

	public UserDetails getUserDetails() {
		/*
		 * if (userDetails == null) { int id = 7;// should come from UI
		 * userDetails = userDetailsService.getuserDetails(id); }
		 */
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public List<UserDetails> getUserDetailsList() {

		userDetailsList = userDetailsService.getAllUserDetails();

		return userDetailsList;
	}

	public void setUserDetailsList(List<UserDetails> userDetailsList) {
		this.userDetailsList = userDetailsList;
	}

	public void setUserDetailsService(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	public void add(ActionEvent a) {

		userDetailsService.add(userDetails);

	}

	

	public void remove() {

		userDetailsService.removeById(id);

	}

	public void update() {

		userDetailsService.update(userDetails);

	}

	public void closeModal() {
		System.out.println("Close update");
		RequestContext context = RequestContext.getCurrentInstance();
		// context.update(":firstForm:table");
		context.execute("$('.modalPseudoClass').modal('hide');");

	}
}
