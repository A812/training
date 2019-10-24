package com.ak.service;

public interface BankAccountService {

	public double withdraw(double withdraw);
	public double deposit(double deposit);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);

	
}
