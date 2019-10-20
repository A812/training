package com.cg;

public class Manager extends Employee {

	private double incentive;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	void display() {

		incentive = 3;
		super.empSal = (100*super.getEmpSal())/incentive;
		super.display();
		System.out.println("emp salary: " + empSal);
	}

}
