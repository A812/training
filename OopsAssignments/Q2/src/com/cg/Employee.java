package com.cg;

public class Employee {
	private int emoId;
	private String empName;
	protected double empSal;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmoId() {
		return emoId;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public void setEmoId(int emoId) {
		this.emoId = emoId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	void display() {
		System.out.println("emp name : " + empName + "\nemp Id: " + emoId);
	}
}
