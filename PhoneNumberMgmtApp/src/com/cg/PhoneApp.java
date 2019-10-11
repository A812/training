package com.cg;

import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {

		PhoneList phoneList = new PhoneList();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your choice: \n1.Add contact\n2.Delete contact\n3.Display\n4.Exit");
			int choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("Enter the no of people you want to add");
				int count = sc.nextInt();

				for (int i = 0; i < count; i++) {
					System.out.println("Enter the name and number");
					String name = sc.next();
					phoneList.addPhoneNumber(name, sc.nextInt());

				}
				break;
			}

			case 2: {
				System.out.println("Enter name to remove");
				sc.nextLine();
				String removename = sc.nextLine();
				phoneList.removeNumber(removename);
				System.out.println("Removed " + removename);
				break;
			}

			case 3: {
				phoneList.display();
				break;
			}
			case 4:
				System.exit(0);
			}
		}
	}
}
