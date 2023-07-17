package com.learn.oops.abstraction;

public abstract class Car {
	
	private final int price =10;
	
	public void seats(int seat) {
		System.out.println("number of seats are ---"+seat);
	}
	
	public void colour(String colour) {
		System.out.println("colour of my car is ---"+colour);
	}
	
	public abstract void engine();//hiding the implementation
	
	public abstract void accelerator();
	
}
