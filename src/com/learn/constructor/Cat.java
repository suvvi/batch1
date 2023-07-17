package com.learn.constructor;

public class Cat extends Animal {
	
	String color;
	public Cat(int age, String name) {
		super(age, name); //calling constructor of parent class
	}
	public Cat(int age, String name, String color) {
		super(age, name);
		this.color = color;
	}

	
}
