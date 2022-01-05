package com.market;

import java. util. Scanner;

public class marketshop {

	public static void main(String[] args) {
		Scanner totalamt= new Scanner(System.in);
		System.out.println("enter the bill amount");
		int billamount = totalamt.nextInt();

		if (billamount>=500 || billamount<1000);{
	     
		System.out.println("discount amount 50");
		int discount=billamount-50;
		System.out.println("total amount"+" "+discount);
	}
   
if(billamount>=1000) {
System.out.println("discount amount 100");
int discount=billamount-100;
System.out.println("total amount"+" "+discount);
}
if(billamount<500) {
	
System.out.println("no discount for this bill");
int totalamt1 =billamount;
System.out.println("total amount discount"+" "+ totalamt1);
}

}}