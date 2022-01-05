package com.methodoverloding;

public class Add{
	
	public int Add(int n1,int n2){
	
	return n1+n2;

}
	public int Add(int n1,int n2,int n3){
		
	return n1+n2+n3;
	}

	public float Add(float n1, float n2){
		
	return n1+n2;
	}
	public static void main(String[] args) {
		
	Add sum = new Add();
	System.out.println("sum oftwo num: " +sum.Add(45,66));
	System.out.println("sum oftwo num" +sum.Add(35,45,22));
	System.out.println("sum oftwo num" +sum.Add(5,6));
	}}
	