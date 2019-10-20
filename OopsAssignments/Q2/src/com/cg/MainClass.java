package com.cg;

public class MainClass {

	public static void main(String[] args) {

		Employee emp1 = new Manager();
		Employee emp2 = new Labour();

		emp1.setEmoId(12);
		emp1.setEmpName("Raj");
		emp1.setEmpSal(10000);

		emp1.display();
		emp2.display();

	}

}
