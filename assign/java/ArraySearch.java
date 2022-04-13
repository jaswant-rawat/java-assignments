package com.assign.java;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		
		
		int [] Arr= {5,12,14,6,78,19,1,23,26,35,37,7,42,86,47};
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the element to find:");
		int num=sc.nextInt();
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]==num)
			{
				System.out.println("Element found at position: "+(i+1));
			}
			else
			{
				System.out.println("Element not found");
				break;
			}
		}
		
	}

}
