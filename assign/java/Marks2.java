package com.assign.java;

import java.util.Scanner;

public class Marks2 {
	
	
	
	
	
	
	public static void main(String[] args) {
		
	int[] st1=new int[3];	
	int[] st2=new int[3];	
	int[] st3=new int[3];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter marks of the first student in subjects A,B and C :");
	
	for(int i=0;i<3;i++)
	{
		st1[i]=sc.nextInt();
		}
System.out.println("Enter marks of the second student in subjects A,B and C :");
	
	for(int i=0;i<3;i++)
	{
		st2[i]=sc.nextInt();
		}
	
		
System.out.println("Enter marks of the third student in subjects A,B and C :");
	
	for(int i=0;i<3;i++)
	{
		st3[i]=sc.nextInt();
		}
		
	
	int sum1=0,sum2=0,sum3=0;
	
	for(int i=0;i<st1.length;i++) {
		sum1+=st1[i];
		
	}
	for(int i=0;i<st1.length;i++) {
		sum2+=st2[i];
		
	}
	for(int i=0;i<st1.length;i++) {
		sum3+=st3[i];
		
	}
	
	int avgA=(st1[0]+st2[0]+st3[0])/3;
	int avgB=(st1[1]+st2[1]+st3[1])/3;
	int avgC=(st1[2]+st2[2]+st3[2])/3;
	
	System.out.println("Total marks obtained by first student: "+sum1);
	System.out.println("Total marks obtained by second student: "+sum2);
	System.out.println("Total marks obtained by third student: "+sum3);
	
	
	System.out.println("Average marks in subject A: "+avgA);
	System.out.println("Average marks in subject B: "+avgB);
	System.out.println("Average marks in subject C: "+avgC);
	}

}
