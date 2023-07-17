package com.learn.oop.inheritance;

public class DomesticAnimal extends Animal{
	
	public void domestic() {
		System.out.println("I m a domestic animal");
	}
	
	@Override
	public void walk() {
		System.out.println("Domestic Animal can walk very slow");
	}
}
