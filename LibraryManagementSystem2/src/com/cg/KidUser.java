package com.cg;

public class KidUser implements LibraryUser {

	public int age;
	public String bookType;
	
	
	@Override
	public void registerAccount(int age) {
		// TODO Auto-generated method stub
		
		if(age <12) {
			System.out.println("you have successfully registered under kids account");
			
		} 
		
		else {
			System.out.println("Age must be less than 12");
		}
		
	}

	@Override
	public void requestBook(String bookType) {
		// TODO Auto-generated method stub
		
		if(bookType == "kids") {
			System.out.println("Book issued successfully");
		}else System.out.println("You are allowed to take only kids books");
		
	}

}
