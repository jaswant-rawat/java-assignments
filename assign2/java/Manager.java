package com.assign2.java;

public class Manager extends Employee {

	
	Employee employee3=new Employee();
	
	int incentive=10000;
		void salary() {
			
			System.out.println("Incentive is "+incentive+"salary is"+employee3.basic_salary );
			System.out.println("Total salary of manager is "+(incentive+employee3.basic_salary));
		}
}
