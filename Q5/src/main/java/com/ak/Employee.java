package com.ak;

import javax.annotation.Resource;

public class Employee {

	private String name;
	
	@Resource
	private Address address;
	
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	
	public void displayEmployeeDetails()
    {
        System.out.println(
                "Employee [name=" + name + ", address=" + address + "]");
    }
}
