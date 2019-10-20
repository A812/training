package com.cg;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
	
	Account acc=new Account();
	  
	  
	  Scanner s = new Scanner(System.in);
	  while (true) {
	   System.out.println("ATM");
	   System.out.println("Press 1 for Withdraw");
	   System.out.println("Press 2 for Deposit");
	   System.out.println("Press 3 for EXIT");
	   System.out.print("Choose the operation you want to perform:");
	   int n = s.nextInt();
	   switch (n) {
	   case 1:
	    System.out.print("Enter money to be withdrawn:");
	    int w= s.nextInt();
	    Account.withdrawM(w);
	    break;

	   case 2:
	    System.out.print("Enter money to be deposited:");
	    int d = s.nextInt();
	    Account.depositM(d);
	    break;

	   case 3:
	    System.exit(0);

	   }
	  }

}

}
