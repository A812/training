package com.cg;

public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		// TODO Auto-generated constructor stub
		super.setBasicSalary(basicSalary);
	}
	
	@Override
	public void calculateTransportAllowance() {
		double transportAllowance;
		
		transportAllowance = 15/100*basicSalary;
		
		System.out.println("Transport allowance is " +transportAllowance);
	}
	
}
