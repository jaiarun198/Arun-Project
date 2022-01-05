package project_java;

import java.util.Scanner;

public class Coding {
	public static void main(String[] args){
		
int  fixedprice , cashback  ;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter original price -> ");
	fixedprice = input.nextInt();
	if (fixedprice >1000 ||fixedprice >500){
	
	    cashback =fixedprice - 100;
		System.out.println("cashback = " + -fixedprice);
	
	}
		else {
			
			cashback = fixedprice -50;		
    	    System.out.println("totalprice = "+ fixedprice);
	        
	}
    	
	}}
	

	