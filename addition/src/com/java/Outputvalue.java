package com.java;

import java.util.Scanner;

public class Outputvalue {

	public static void main(String[] args){
	
	
		Scanner calc = new Scanner(System.in);
		System.out.println("first Number");
		double firstNumber =calc.nextInt();
        System.out.println("second number");
        double secondnumber = calc.nextInt();
        double result = firstNumber+secondnumber;
        System.out.println("the answer is"+" "+result);
 
		
  	}

}
