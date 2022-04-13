package com.assign.java;

import java.util.Scanner;

public class User_Authentication 
{
    public static void main(String args[])
    {
    	int count = 0;
    	

    	String inputUsername,inputPassword;
    	
    	Scanner input=new Scanner(System.in);
    	
    	System.out.println("Enter username:");
    	
    	inputUsername = input.next();
    	
    	System.out.println("Enter password:");
    	inputPassword = input.next();
    	
		//create while loop, set loop continuation condition to count <2
    	while (count < 2 && ((!inputUsername.equals("userName")) || (!inputPassword.equals("password")))) {
    	    System.out.println("Wrong entry. try again: Enter username");
    	    inputUsername = input.next();

    	    System.out.println("Enter password");
    	    inputPassword = input.next();
    	    count++;    
    	}   
    	if ((inputUsername.equals("userName")) && (inputPassword.equals("password")))
    	    System.out.println("You are now logged in");
    	else
    	    System.out.println("You have enterede wrong three times. Please try again in a few hours");

    	    System.exit(0);
    }
}