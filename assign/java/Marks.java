package com.assign.java;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		
		
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the marks for first subject: ");
		int a =sc.nextInt();
		System.out.println("Enter the marks for second subject: ");
		int b=sc.nextInt();
		System.out.println("Enter the marks for third subject: ");
		int c=sc.nextInt();
		
	int count=0;
	
	if(a>60)
	{count++;}
	if(b>60)
	{
		count++;
	}
	if(c>60)
	{
		count++;
	}
	
	//System.out.println("count is "+count);
	if(count<=1)
	{
		System.out.println("Failed");
	}else if(count==2)
	{
		System.out.println("Promoted");
	}else if(count==3)
	{
		System.out.println("Passed");
	}
		sc.close();
	}}