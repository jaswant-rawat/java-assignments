package com.assign4.java;

public class IllegalBankTransactionException extends RuntimeException{

	
	double amount;

	public IllegalBankTransactionException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public IllegalBankTransactionException(double amount)
	{
		this.amount=amount;
	}
	
	
}
