package com.assign4.java;

import java.util.Scanner;

public class BankExc {

	long id;
	double balance=10000;
	public  void withdraw(double amount) {
		
		if(amount>balance || balance==0) {
			throw new InsufficientBalanceException(amount);
		}else if(amount<0)
			{
			
			throw new IllegalBankTransactionException(amount);
		}else {
			System.out.println("Amount withdrawn: "+amount);
		}
		
	}
	public void deposit(double amount) {
		
		
		
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		try {
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter amount to be withdrawn: ");
			
			double amount=sc.nextDouble();
			new BankExc().withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
		
		
		
		
	}
}
