package com.ak;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ak.model.BankAccount;
import com.ak.service.BankAccountService;
import com.ak.service.BankAccountServiceImpl;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice :\n1.Withdraw\n2.Deposit\n3.Display\n4.transfer");
		int choice = sc.nextInt();
		BankAccountService service = new BankAccountServiceImpl();

		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("config.xml"); BankAccount bankAccount =
		 * (BankAccount)applicationContext.getBean("details");
		 */

		switch (choice) {

		case 1:
			System.out.println("Enter withdraw amount: ");
			double withdraw = sc.nextDouble();
			service.withdraw(withdraw);
			break;

		case 2: 
			System.out.println("Enter Deposit amount: ");
			double deposit = sc.nextDouble();
			service.deposit(deposit);
			break;
			
		case 3:
			ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("config.xml");
			BankAccount bankAccount1 = (BankAccount) applicationContext1.getBean("customer");
			bankAccount1.msg();
			bankAccount1.displayDetails();
		}

	}
}
