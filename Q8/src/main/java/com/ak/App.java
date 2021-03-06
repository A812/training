package com.ak;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "config.xml" });

		CustomerService cust = (CustomerService) context.getBean("customerService");

		System.out.println(cust);

		context.close();
	}
}