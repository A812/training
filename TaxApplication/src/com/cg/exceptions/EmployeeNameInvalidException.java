package com.cg.exceptions;

public class EmployeeNameInvalidException extends Exception {

	String msg;

	public EmployeeNameInvalidException(String msg) {
		super();
		this.msg = msg;
	}
	
	
	
}
