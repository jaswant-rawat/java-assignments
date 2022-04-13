package com.assign.java;

public class BreakEx {

	
	static int num1;
	
	
	static {
		System.out.println("static block");
		num1=20;
		System.out.println();
			}
	public static void main(String[] args) {
		
		
		
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
			break;
			
			}
			System.out.print(i+" ");
			
		}
		
		System.out.println("After continue");
		for(int i=0;i<=10;i++)
		{
			if(i>=6)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("static value:"+num1);
	}
}

/* 
 * BREAK:---it breaks the current flow of the code at a specified condition
 * 
 * CONTINUE:--continue, continues the flow of code and skips the condition part
 */