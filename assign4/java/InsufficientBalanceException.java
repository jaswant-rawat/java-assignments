package com.assign4.java;

public class InsufficientBalanceException  extends RuntimeException{

	double amount;
	public InsufficientBalanceException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InsufficientBalanceException(double amount) {
		
		this.amount=amount;
	}
	
	
	public static void main(String[] args) {
		
		
	}

}
