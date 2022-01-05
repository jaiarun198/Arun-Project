package com.jai19.Jai9;

public class Object1 {
	
	private static Object1 ab;
	private Object1(int age)
	
	{
		System.out.println("d con "+ age );
	}
	
    public void m1() {
	System.out.println("normal method calling ");
     }

     public void m2() {
     System.out.println("2 method calling ");
     }

public static Object1 getinstance() {
	if (ab==null)
	{
		ab =new Object1(14);
	}
	return ab;
}}