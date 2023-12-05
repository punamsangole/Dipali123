package com.tests;

public class RealEample {
	
	public static void main(String[] args) {
		A a=new A();
		a.test(new Object());//test- Object
		a.test("shraddha");//test- String
		a.test(new A());//test Object
		a.test(new String());//String str=new String();     test- String
	
	}
	

}
class A{
	void test(Object object) {
		System.out.println("test- Object");
	}
	void test(String string) {
		System.out.println("test- String");
	}
}
