package com.ak;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * Resource res = new ClassPathResource("src/main/resources/config.xml");
		 * BeanFactory beanFactory = new XmlBeanFactory(res);
		 */
		
		/*
		 * BeanFactory factory = new ClassPathXmlApplicationContext("config.xml");
		 * Customer customer = (Customer)factory.getBean("address");
		 */

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Customer customer = (Customer) applicationContext.getBean("details");
		Customer customer1 = (Customer) applicationContext.getBean("details1");
		customer.getMessage();
		System.out.println(customer);
		System.out.println(customer1);

	}

}
