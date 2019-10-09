package com.cg;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		
		System.out.println("hi");
		
		AdultUser adultUser = new AdultUser();
		KidUser kidUser = new KidUser();
	
	System.out.println("Test case 1-");	
		adultUser.registerAccount(5);
		adultUser.requestBook("abc");

	System.out.println("Test case 2-");
		
		kidUser.registerAccount(20);
		kidUser.requestBook("kid");
	
	}
	
}
