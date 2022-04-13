package com.assign.java;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortMethod {
	
	
	
	public static void bubbleSort(int[] arr) {
		
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;(j<arr.length-i);j++) {
				
				if(arr[j-1]>arr[j]) {
					//swap elements
					
					temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
				}
			}
		}
	}
	public static void main(String[] args) {
		
		
		int [] Arr= {5,12,14,6,78,19,1,23,26,35,37,7,42,86,47};
		
		
	System.out.println("Array before bubble sort: ");

	for(int ab :Arr)
	{
		System.out.print(ab+" ");
	}
	
	
	bubbleSort(Arr);
	
	System.out.println("Array before bubble sort: ");

	for(int ab :Arr)
	{
		System.out.print(ab+" ");
	}
		
		System.out.println("AFTER BUBBLE sort");
		
		//using sort method
		Arrays.sort(Arr);
		
		for(int ab :Arr)
		{
			System.out.print(ab+" ");
		}
	}
	

}
