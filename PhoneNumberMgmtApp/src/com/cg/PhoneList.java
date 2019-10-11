package com.cg;

import java.util.HashMap;

public class PhoneList {

	public HashMap<String, Long> phoneList1 = new HashMap<String, Long>();
	
	public void addPhoneNumber(String name, long phNo) {
			
		phoneList1.put(name, phNo);
		
	}

	public void removeNumber(String name) {
		// TODO Auto-generated method stub
		
		phoneList1.remove(name);
	}
	
	public void display() {
		phoneList1.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
	}
	
}
