package com.learn.oops.keywords;

public class WildAnimal extends Animal{
	
	public void wild() {
		System.out.println("I m a wild animal");
	}
	
	@Override
	public void walk() {
		System.out.println("wild animal can walk very fast");
	}
	
}
