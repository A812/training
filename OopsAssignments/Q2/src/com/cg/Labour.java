package com.cg;

public class Labour extends Employee {

	private double hrs;

	public Labour() {
		// TODO Auto-generated constructor stub
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	void display() {

		hrs = 3;
		System.out.println("overtime : " + hrs + "hrs");
	}
}
