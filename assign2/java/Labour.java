package com.assign2.java;

public class Labour extends Employee{
Employee employee2=new Employee();
	
int overTime=5000;
	void salary() {
		
		System.out.println("Overtime is "+overTime+"salary is"+employee2.basic_salary );
		System.out.println("Total salary of labour is "+(overTime+employee2.basic_salary));
	}
}
