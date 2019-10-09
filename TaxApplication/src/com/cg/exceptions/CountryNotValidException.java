package com.cg.exceptions;

public class CountryNotValidException extends Exception {

	String msg;

	public CountryNotValidException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
