package com.cg;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager(123, "Arun", "epip", 990008882);
		manager.setBasicSalary(30000);
		manager.calculateSalary();
		manager.calculateTransportAllowance();
		
		
		
		Trainee trainee = new Trainee(45, "Raju", "Epip", 88723219);
		trainee.setBasicSalary(15000);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance();

		
	}
		

}
