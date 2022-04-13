package com.assign2.java;


class Employee{
	
	int money=0;
	int basic_salary=10000;
	void salary() {
		System.out.println("Salary is "+basic_salary+money);
	}
}


public class Org {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.salary();
		
		Labour labour=new Labour();
		Manager manager=new Manager();
		
		
		
		System.out.println("Salaries:--");
		labour.salary();
		manager.salary();
		
		
	}
}
