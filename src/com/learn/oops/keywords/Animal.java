package com.learn.oops.keywords;

public class Animal {
	final int age = 10;
	
	public void walk() {
		//age = 20;
		System.out.println("Animal can walk");
	}
	
	public final void eat() {
		//age = 45;
		System.out.println("Animal can eat");
	}
}
