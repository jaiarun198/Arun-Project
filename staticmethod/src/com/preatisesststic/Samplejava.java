package com.preatisesststic;

public class Samplejava {

public static void method1() {
		System.out.println("this is static method");
}
public static void method2() {
	System.out.println("this is nonstatic method");
}
public static void main(String[] args) {
	method1();
	Samplejava s= new Samplejava();
	s.method2();
}
}