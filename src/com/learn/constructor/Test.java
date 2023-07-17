package com.learn.constructor;

import java.io.FileWriter;

public class Test {
	//constructor is special method required to initialize the object
	//when we create a class compiler creates Default constructor 
	//if we create our own constructor Default constructor is no more available
	//constructor overloading 
	
	Test(){  //no argument constructor
		System.out.println("My constructor");
	}
	
	Test(int a){ //parameterised constructor
		System.out.println("My constructor with param----"+a);
	}
	
	Test(int a, int b){ //parameterised constructor
		System.out.println("My constructor with 2 param----"+a + "  "+b);
	}
	
	public static void main(String[] args) {
		
		Test t = new Test(); 
		t.area(2);
		t.area(2,3);
		
		
		Test t1 = new Test(2); 
		
	}
	
	
	
	public void area() {
		int area = 2*2;
		System.out.println(area);
	}
	
	public void area(int a) {
		int area = a*a;
		System.out.println(area);
	}
	
	public void area(int a, int b) {
		int area = a*b;
		System.out.println(area);
	}
}
