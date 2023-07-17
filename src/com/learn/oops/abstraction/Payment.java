package com.learn.oops.abstraction;

public abstract class Payment {
	
	public void balance() {
		System.out.println("check the balance");
	}
	
	public void user() {
		System.out.println("check the valid user");
		int a =10;
		System.out.println("check the valid user"+a);
		System.out.println(a);
		char c ='a';
		System.out.println(c);
				
	}
	
	public abstract void payment(); //incomplete 
}
