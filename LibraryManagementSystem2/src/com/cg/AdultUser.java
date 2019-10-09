package com.cg;


public class AdultUser implements LibraryUser {

	public int age;
	public String bookType;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	

	@Override
	public void registerAccount(int age) {
		// TODO Auto-generated method stub
		
		if(age > 12) {
			System.out.println("you have successfully registered under adult account");
		}
		else {
			System.out.println("Age must be less than 12");
		}
		
	}

	@Override
	public void requestBook(String bookType) {
		// TODO Auto-generated method stub
		
		if(bookType == "fiction") {
			System.out.println("Book issued successfully");
		}else System.out.println("You are allowed to take only adult fition books");
		
	}

	
	
}
