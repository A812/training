package com.ak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		System.out.println("---------------------------------------");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Got employee object from the ApplicationContext[Spring Container]");

		employee.displayEmployeeDetails();
	}
}
