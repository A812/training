package com.cg;

public class MainClass {

	public static void main(String[] args) {
		Date d= new Date();
		
		Date d3 = new Date();
		d3.setDay(21);
		d3.setMonth(9);
		d3.setYear(1996);
		
		Date d4 = new Date();
		d4.setDay(14);
		d4.setMonth(8);
		d4.setYear(1991);
		 System.out.println("Before Swap :");
		d3.printDate();
		d4.printDate();
		System.out.println("After Swap :");
		d.swap(d3,d4);
	}
}
