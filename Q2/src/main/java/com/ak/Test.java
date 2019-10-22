package com.ak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Question question = (Question)applicationContext.getBean("details");
		System.out.println(question);
		question.msg();
	}

}
