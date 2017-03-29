package com.abk.jsf.mbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.primefaces.context.RequestContext;

import com.abk.hibernate.model.UserDetails;
import com.abk.spring.service.UserDetailsService;
import com.abk.utils.ValidatorBean;

import java.util.Set;
import javax.validation.ConstraintViolation;

@ManagedBean
@ViewScoped
public class UserDetailsMBean implements Serializable {

	/**
	 * 
	 */
	
	private static final String _LOOK_SUCCESS = "success";
	
	private static final String _LOOK_WARNING = "warning";
	
	private static final String _LABEL_ADD = "Add";
	
	private static final String _LABEL_EDIT = "Edit";
	
	private static final long serialVersionUID = 5284375997088938438L;

	// inject spring bean via DI
	@ManagedProperty("#{userDetailsService}")
	private UserDetailsService userDetailsService;

	@ManagedProperty("#{userDetails}")
	private UserDetails userDetails;

	private List<UserDetails> userDetailsList;

	private UserDetails selectedUsr;

	private String look;
	private String label;
	

	public String getLook() {
		return look;
	}

	public void setLook(String look) {
		this.look = look;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public UserDetails getSelectedUsr() {
		return selectedUsr;
	}

	public void setSelectedUsr(UserDetails selectedUsr) {
		this.selectedUsr = selectedUsr;
	}

	public UserDetails getUserDetails() {
		
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


	public void dispatch(ActionEvent a){
		
		if(ValidatorBean.validate(userDetails)){
			
			
		switch (label) {
		case _LABEL_ADD:
			add(a);
			break;

		case _LABEL_EDIT:
			update(a);
			break;
		default:
			break;
		}
		
		RequestContext context = RequestContext.getCurrentInstance();
		
	    context.execute("$('.modalPseudoClass').modal('hide');");
		}
	}
	public void add(ActionEvent a) {

		//RequestContext.getCurrentInstance().closeDialog(arg0);
		
		Serializable res = userDetailsService.add(userDetails);
		System.out.println(res);
		userDetailsService.reset(userDetails);
	//	RequestContext context = RequestContext.getCurrentInstance();
		// context.update(":firstForm:table");
	//	context.execute("$('.modalPseudoClass').modal('hide');");

	}

	public void add(){
		
		look = _LOOK_SUCCESS;
		label = _LABEL_ADD;
		userDetailsService.reset(userDetails);
		
		
		
	}

	public void select(UserDetails usr) {
		userDetails = usr;
	}
	
	public void remove(ActionEvent e) {

		userDetailsService.remove(userDetails);
		userDetailsService.reset(userDetails);

	}

	public void update(ActionEvent e) {

		userDetailsService.update(userDetails);

	}
	
	public void update(UserDetails usr){
		look = _LOOK_WARNING;
		label = _LABEL_EDIT;
		select(usr);
		System.out.println("update");
		System.out.println(look);
		System.out.println(label);
		System.out.println(userDetails.getFirstName());
	}
	
	public void reset(){
		userDetailsService.reset(userDetails);
	}

	
}
