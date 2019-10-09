package com.cg;

public class Trainee extends Employee {

	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		super.setBasicSalary(basicSalary);
	}
	
	
}
