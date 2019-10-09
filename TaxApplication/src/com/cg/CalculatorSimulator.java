package com.cg;

import com.cg.exceptions.CountryNotValidException;
import com.cg.exceptions.EmployeeNameInvalidException;
import com.cg.exceptions.TaxNotEligibleException;

public class CalculatorSimulator {

	public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		
		
		System.out.println("hi");
		
		TaxCalculator taxCalculator = new TaxCalculator();	
		
		taxCalculator.setEmpName("arun");
		taxCalculator.setEmpSal(80009.0);
		taxCalculator.setIndian(true);
		
		if(taxCalculator.isIndian!=true) 
			throw new CountryNotValidException("Employee should be an indian citizen");
		
		if(taxCalculator.empName==null)
		throw new EmployeeNameInvalidException("Employee name cnnot be empty");
		
		taxCalculator.calculateTax();
		System.out.println("tax is " + taxCalculator.taxAmount);
		
	}
}
