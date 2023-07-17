package com.learn.oops.keywords;

public class DomesticAnimal extends Animal{
	
	final int  age = 20;
	int kg = 1000;
	
	public void domestic() {
		System.out.println("I m a domestic animal");
		System.out.println("age in Animal class---"+super.age);
		System.out.println("age in Domestic Animal class---"+this.age);
	//	age = 40;
		super.walk(); //referring parent class method
		this.walk();//referring child class method
	}
	
	@Override
	public void walk() {
		System.out.println("Domestic Animal can walk very slow");
	}
	
	
}
