package com.tests;

public class Polymorphism {
	public static void main(String[] args) {
		Student s=new Student();
		s.add(10, 20);
		s.add(10.4, 10.5);
		s.add(10.00);
		s.add(10, 20, 30);
	}
	
	

}

 class Student{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(double a,double b) {
		System.out.println(a+b);
	}
	void add(double a) {
		System.out.println(a);
		
	}
	void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
}


