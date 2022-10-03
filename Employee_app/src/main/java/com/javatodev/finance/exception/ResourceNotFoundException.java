package com.javatodev.finance.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException  (String string, String string2, Integer employeeId) {
		super(string+string2+employeeId.toString());
	}

}
