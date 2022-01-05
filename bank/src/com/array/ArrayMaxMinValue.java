package com.array;

import java.util.Scanner;

public class ArrayMaxMinValue {

	public static void main(String args[]) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count");
		int max ,min;
		int n=scan.nextInt();
		int arr []  =new int[n];
		min=arr[0];
		max=arr[0];
		for(int i=0; i<n; i++){
	    System.out.print("Enter the value :");
		arr[i]=scan.nextInt();
								   }
		min=arr[0];
	    max=arr[0];
        for(int i=0; i<n; i++){
	    if(min>arr[i]){
	    min=arr[i];
								     }
	    if(max<arr[i]){
	    max=arr[i];  
								     }
								   }
		 System.out.print("\nThe min value in the array: "+min);
		 System.out.print("\nThe max value in the array: "+max);
				

	}

}
