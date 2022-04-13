package com.assign4.java;

import java.util.Scanner;

public class ArithmeticExc {
	
	public static void main(String[] args) {
		Scanner sc=null;
		try {
			 sc=new Scanner(System.in);
			
			System.out.println("enter first number:");
			int num1=sc.nextInt();
			
			System.out.println("enter second number:");
			int num2=sc.nextInt();
			
			int result=num1/num2;
			
			System.out.println("Result is: "+result);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		    throw new UnsupportedOperationException("Invalid operation");

//			e.printStackTrace();
		}
		finally {
			if(sc !=null)
				sc.close();
		}
		
	}

}
