package com.assign.java;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		System.out.println("Enter your CTC");
		
		Scanner sc =new Scanner(System.in);
		
		double ctc=sc.nextDouble();
		
		
		
		if(ctc>=0 && ctc<=180000)
		{
			System.out.println("No tax for you");
		}
		
		else if(ctc>=181001 && ctc<=300000)
		{
			System.out.println("Tax is "+ (ctc*0.1));
			
		}else if(ctc>=300001 && ctc<=500000)
		{
			System.out.println("Tax is "+ (ctc*0.2));
			
		}else if(ctc>=500001 && ctc<=1000000)
		{
			System.out.println("Tax is "+ (ctc*0.3));
			
		}
		else
		{
			System.out.println("you have entered wrong ctc");
		}
		
		
	}
}
