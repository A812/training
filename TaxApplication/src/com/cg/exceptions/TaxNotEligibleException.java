package com.cg.exceptions;

public class TaxNotEligibleException extends Exception{

	String msg;

	public TaxNotEligibleException(String msg) {
		super();
		this.msg = msg;
	}
	
}
