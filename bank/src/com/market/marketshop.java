package com.market;


import java. util. Scanner;

public class marketshop {

	public static void main(String[] args) {
		
		
		Scanner totalamt= new Scanner(System.in);
		System.out.println("enter the bill amount");
		int billamount = totalamt.nextInt();

		if (billamount>=500 && billamount<1000)
		{
	     
		System.out.println("discount amount you got");
		int discount=billamount-50;
		System.out.println("total amount"+" "+discount);
	}
   
		else if(billamount>=1000) {
System.out.println("discount amount 100");
int discount=billamount-100;
System.out.println("total amount"+" "+discount);
}
		else {
System.out.println("No discount");
System.out.println("total amount "+" "+ billamount);
}
	}
}