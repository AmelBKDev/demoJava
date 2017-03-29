package com.abk.utils;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.abk.hibernate.model.UserDetails;

public class ValidatorBean {
	
	public static boolean validate(UserDetails userDetails){
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<UserDetails>> constraintViolations =
		
		validator.validate(userDetails);
			
		if (constraintViolations.size() > 0 ) {
			return false;
		}
		return true;
	}

}
