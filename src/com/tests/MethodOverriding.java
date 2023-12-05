package com.tests;

public class MethodOverriding {
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		
	}
	
	

}
 class A1{
	 
	void m1() {
		System.out.println("class A m1() method");
	}
}

 class B extends A1{
	 @Override
	void m1() {
		System.out.println("class B m1() method");
	}
	
}
