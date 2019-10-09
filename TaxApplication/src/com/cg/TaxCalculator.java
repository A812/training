package com.cg;

import com.cg.exceptions.TaxNotEligibleException;

public class TaxCalculator {

	public String empName;
	public boolean isIndian;
	public double empSal;
	public double taxAmount;

	public TaxCalculator() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public boolean isIndian() {
		return isIndian;
	}

	public void setIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public void calculateTax() throws TaxNotEligibleException {

		if (empSal > 100000 && isIndian == true) {
			taxAmount = empSal * 8 / 100;
		} else if (empSal >= 50000 && empSal <= 100000 && isIndian == true) {
			taxAmount = empSal * 6 / 100;
		} else if (empSal >= 30000 && empSal <= 50000 && isIndian == true) {
			taxAmount = empSal * 5 / 100;
		} else if (empSal >= 10000 && empSal <= 30000 && isIndian == true) {
			taxAmount = empSal * 4 / 100;
		}
		else
			throw new TaxNotEligibleException ("Employee does not need to pay tax");

	}
}
